package chapter10;

// === Map 인터페이스 === /
// : 키(key)와 값(value)의 쌍으로 요소를 저장하는 데이터 구조
// - 키는 고유한 데이터를 가진다.(중복 키 허용 X)
// - 동일한 키에 서로 다른 값을 전달하는 경우 기존 값이 새로운 값을 덮어쓰워짐
// EX) name : "이승아"가 존재한 상태에서 name : "이도경"을 추가하는 경우
//             name 의 키에는 "이도경" 만이 존재

// - 서로 다른 키에서 동일한 값 저장은 가능
// EX) name : "개구리", nickname : "개구리" 가능

// 키의 유일성, 값의 중복성
// + 순서 보장 X (LinkedHashMap 은 순서 보장 O)
// + 키를 기반으로 빠른 검색 가능

// == Map 인터페이스 종류 (구현체) == //
    // 1. HashMap
    // : 가장 많이 사용되는 Map 구현체
    // : 키와 값이 null 허용
    // - 빠른 검색 및 삽입 성능 제공
    // - 순서 유지 X

    // 2. LinkedHashMap
    // : HashMap + 삽입 순서 유지
    // - 삽입 순서가 중요하고 빠른 검색이 필요할 때 주로 사용

    // 3. TreeMap(오름차순 자동 정렬)
    // : 키에 따라 자동 정렬 기능 보장
    // - 키에 null 허용 X

import java.sql.SQLOutput;
import java.util.*;

public class E_Map {
    public static void main(String[] args) {
        // == Map 인터페이스 메서드 == //

        // put(K key, V value) : 키와 값을 Map 에 추가
        // get(Object key) : 지정된 키에 매핑된 '값'을 반환
        // remove(Object key) : 주어진 키와 연관된 '키-값' 쌍 삭제(반환)
        // containsKey(Object key) : 주어진 키가 Map 에 있는지 확인하여 boolean 값으로 반환

        // keySet() : Map 의 키를 Set 으로 반환
        // values() : Map 의 값을 컬렉션 타입으로 반환
        //          Collection 의 경우 컬렉션 프레임워크들의 상위 집합

        // entrySet() : Map 의 키-값 쌍을 나타내는 Set 을 반환

        // == Map 컬렉션 선언 방법 == //
        // Map<키타입, 값타입> 인스턴스명 = new Map 종류<>();

        Map<String, Integer> student = new HashMap<>();
        // 이름 (키), 나이 (값)

        student.put("이승아", 50);
        student.put("이도경", 60);
        student.put("김명진", 70);

        System.out.println(student);

        // 순서 보장 X, {} 중괄호 형식 사용, 키와 값을 = 로 구분

        System.out.println(student.get("이도경"));

        student.remove("이승아");
        System.out.println(student);

        System.out.println(student.containsKey("이도경"));
        System.out.println(student.containsKey("이지희"));

        System.out.println(student.size());

        System.out.println(student.keySet());
        Set<String> names = student.keySet();

        System.out.println(student.values());
        Collection<Integer> ages = student.values();

        // Collection 을  List 로 변환
        // : List 인터페이스의 구현체로 변환
        List<Integer> listAges = new ArrayList<>(ages);

        // List<Integer> listAges = (List<Integer>) ages;
    }
}
