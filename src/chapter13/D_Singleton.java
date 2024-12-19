package chapter13;

// === Singleton 패턴 === //
// : 소프트웨어 설계 패턴 중 하나
// >> 클래스의 인스턴스가 하나만 생성되도록 보장
// >> 해당 클래스의 인스턴스에 전역적 접근을 제공하지만 일관된 상태를 유지

// == 싱클톤 패턴의 사용 목적 ==
// 1) 객체의 유일성을 보장
// 2) 자원의 절약

// == 싱클톤 패턴의 장단점 == //
// 1) 장점
//      - 자원의 중복 생성을 방지, 메모리 사용 최적화
//      - 전역 상태를 공유 + 통제된 접근

// 2) 단점
//      - 전역 상태를 관리 + 다른 클래스에 영향(결합의 가능성)
//      - 테스트가 어려움

import javax.print.SimpleDoc;

class Singleton {
    // static 필드
    // : 클래스 타입 그 자체를 가지는 필드
    private static Singleton instance;

    private Singleton() {};
    // 생성자를 private으로 선언
    // : 외부에서 직접적인 인스턴스화가 불가

    // 전역 접근성을 제공하는 메서드 정의(인스턴스화 담당)
    public static Singleton getInstance() {
        if (instance == null) { // static 필드에 아무런 값이 없다면(한 번도 인스턴스화 X)
            instance = new Singleton(); // 인스턴스를 진행
        }
        return instance;
    }
}

class SchoolPrincipal {
    private static SchoolPrincipal instance;

    // 1. 생산자를 private으로 만들어 다른 곳에서 객체 생성이 불가하도록 설정
    private SchoolPrincipal() {
        System.out.println("교장 선생님 객체 생성!");
    }

    // 2. getInstance() 메서드 통해 객체를 제공
    public static SchoolPrincipal getInstance() {
        if (instance == null) { // 객체가 없으면 새로 생성
            instance = new SchoolPrincipal();
        }
        return instance; // 객체를 반환
    }
        public void announce() {
            System.out.println("공부 열심히 하고 운동 열심히 하고 일찍 자고 일어나세요");
        }
}

public class D_Singleton {
    public static void main(String[] args) {

        SchoolPrincipal principal1 = SchoolPrincipal.getInstance();
        SchoolPrincipal principal2 = SchoolPrincipal.getInstance();

        System.out.println(principal1);
        System.out.println(principal2);
        System.out.println(principal1 == principal2);

        principal1.announce();

    }
}
