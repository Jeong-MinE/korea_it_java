package chapter09;

/*
* java.lang 패키지
* : 자바 프로그램의 가장 기본적인 클래스들을 포함
* - 별도의 import문 없이 사용 가능
* */

// 1. Object 클래스
// : 자바에서 모든 클래스의 최상위 클래스
// - 모든 클래스는 Object 클래스를 상속받음

// 2. Math
// : 수학 연산 및 함수를 제공하는 클래스
// - 모든 필드와 메서드는 static!

// 3. String 클래스
// : 문자열 조작을 위한 다양한 메서드를 제공

import java.sql.SQLOutput;

class MyClass extends Object {
    private int id;
    private String name;

    MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }
    // 1) toString() 메서드
    // : 객체의 문자열 포현을 반환
    // - 기본 구현 : '객체의 클래스 이름 + @ + 메모리 주소' 반환
    // - 오버라이딩(재정의) : 원하는 정보를 반환
    @Override
    public String toString() {
        return "MyClass(ID: " + id + "/ NAME: " + name + ")";
    }

    // 2) equals(Object obj) 메서드
    // : 두 객체가 동등한지 비교
    // - 두 객체가 참조를 비교(동일한 주소값을 가지는지 확인)
    // - 오버라이딩(재정의) : 객체 내용 기반의 비교를 구현 가능

}

public class JavaLang {
    public static void main(String[] args) {
        MyClass myClass1 = new MyClass(1, "차정민");
        System.out.println(myClass1.toString());

        MyClass myClass2 = new MyClass(2, "으우아");
        System.out.println(myClass1.equals(myClass2)); // false

        System.out.println("========================");
        System.out.println(Math.abs(-10)); // 절대값 반환 : .abs(데이터)
        System.out.println(Math.max(100,200)); // 최대값 반환 : .max(데이터1, 데이터2)
        System.out.println(Math.min(100,200)); // 최대값 반환 : .max(데이터1, 데이터2)
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(2, 3)); // 제곱 값 반환 : .pow(a,b) == a의 b제곱
        System.out.println(Math.random());
        // 무작위 난수를 생성 : .random() - 0.0이상 1.0 미만의 난수를 생성

        System.out.println("===========String 클래스 ==============");
        String message = "Merry Christmas!";

        System.out.println(message.length()); // - 문자 뿐만 아니라 공백, 기호까지 포함

        boolean isEquals = message.equals("Meery Christams^^");
        System.out.println(isEquals);

        // substring(int start, int end)
        // : 시작 인덱스(포함)부터 끝 인덱스(미포함)까지의 부분 문자열을 반환
        // - 인덱스 번호는 0부터 시작, 공백과 기호까지 포함
    }
}
