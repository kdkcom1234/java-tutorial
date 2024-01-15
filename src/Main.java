import com.myuniversity.Person;
import com.myuniversity.UtilSingletonEx;
import com.myuniversity.students.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 생성자를 이용하여 객체를 생성
        // 클래스명 변수명(객체명-object,인스턴스명-instance)
        // 인스턴스: 어떤 형식을 찍어낸 메모리 공간을 인스턴스라고 함
        // 필드의 초기값을 생성자에 매개변수를 넘겨서 초기화 함
//        Person p = new Person("Kim", 30);
////        com.myuniversity.Person p = new com.myuniversity.Person();
////        // 필드 직접 접근
////        p.name = "Lee"; // 필드값 변경
////        System.out.println(p.name); // 필드값 조회
////        p.printInfo();
//
//        // getter/setter로 접근
//        p.setName("Hong"); // 필드값 변경
//        System.out.println(p.getName()); // 필드값 조회
//        System.out.println(p.getName() + "/" + p.getAge()); // 출력형식
//        p.printInfo(); // 출력형식 내장
//
//        // Student(자식), Person(부모)
//        Person p = new Person("Kim", 20);
//        System.out.println(p.getName());
//
//        Person p2 = new Person("Lee", 21);
//        System.out.println(p2.getName());
//
//
//        // static 메서드의 사용은 인스턴스(객체) 생서없이 클래스명.메서드명(..) 호출 가능
//        System.out.println(Counter.getCount());
//
//        // 객체생성을 하면 count static 필드가 1증가
//        Counter counter = new Counter("첫번째카운터");
//        System.out.println(counter.getName()); // 객체필드 name을 읽어옴
//        System.out.println(Counter.getCount()); // static필드 count를 읽어옴
//
//        // 일반 필드는 객체 공간에서 사용
//        // static 필드는 클래스 공간에 공유가 된다.
//        Counter counter2 = new Counter("두번째카운터");
//        System.out.println(counter2.getName()); // 객체필드 name을 읽어옴
//        System.out.println(Counter.getCount()); // static필드 count를 읽어옴
//
//        System.out.println(Util.sum(5, 10));

        // UtilSingleton 인스턴스 생성을 최초로 요청하면 객체가 생성되고 반화
        UtilSingletonEx util = UtilSingletonEx.getInstance();
        // 객체를 프린트하면 클래스경로@해시코드(JVM객체Id, 유일한값)
        System.out.println(util);
        util.sum(5, 10);

        // 이미 생성된 객체를 반환
        UtilSingletonEx util2 = UtilSingletonEx.getInstance();
        System.out.println(util2);
        util2.sum(3, 5);

        // 일반 클래스 였을 때: 필요할때만 객체를 생성(new)
        // static 메서드: 프로그램 실행시(main) 메서드 영역에 생성
        // 싱글턴: 필요할때 최초에 한번 객체를 생성, 그 다음부터는 이미 생성된 객체를 사용한다.

        // 메서드만 호출하고, 객체 생성까지 굳이 할필요가 없는 경우
        // Utiliity, Datasource(데이터베이스연결)

        // List 인터페이스를 구현하는 ArrayList 생성
        // 배열처럼 사용하는 컬렉션
        // List<요소의타입> 변수명 = new ArrayList<(선택)요소의타입>();
        List<Integer> nums = new ArrayList<Integer>();
        List<String> fruits = new ArrayList<String>();
        List<Person> people = new ArrayList<Person>();

        // 요소의 추가(가장 뒤쪽에 추가)
        // 리스트변수.add(요소객체);
        nums.add(1);
        // Apple
        fruits.add("Apple");
        // Apple Banana
        fruits.add(new String("Banana"));

        people.add(new Person("Kim", 30));
        people.add(new Person("Lee", 20));

        // 리스트 탐색
        for (String fruit : fruits) {
            System.out.println(fruit);
            System.out.println(fruits.indexOf(fruit)); // 요소의 index 확인
        }

        // 인덱스로 리스트 요소 접근
        // 리스트명.get(인덱스)
        System.out.println(people.get(0).getName()); // 0번째 요소의 필드값을 조회
        people.get(1).setName("Park"); // 1번째 요소의 필드값 변경

        // 특정 인덱스의 요소를 교체/추가
        // 리스트명.set(인덱스, 객체);
        people.set(0, new Person("Kang", 25));

        // 특정 인덱스의 요소를 삭제
        // 리스트명.remove(인덱스)
        people.remove(1);

        // 데이터관점에서 CRUD(create read update delete), 데이터 조작(manipulation)

        List<Person> people1 = new ArrayList<>(); // 내부적으로 배열로 작동, 기본크기가 10개
//        List<Person> peopleArr = new LinkedList<>(); // 내부적으로 배열로 작동, 기본크기가 10개
        List<Person> peopleLinks = new LinkedList<>();

        // 가장 뒤쪽으로만 삽입하는데
        people1.add(new Person("Kim", 30));
        people1.add(new Person("Lee", 35));

        // 중간에 삽입
        people1.add(1, new Person("Kang", 25));

        System.out.println("------------");
        // Set 인터페이스를 구현하는 HashSet 생성
        Set<String> animals = new HashSet<>();

        // 요소 추가
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Bird");

        // 중복 요소 추가 시도 (추가되지 않음)
        // 같은 요소가 있는 비교는 값으로 비교하는게 아님
        // 객체의 hashcode 메서드와 equals 메서드를 호출해서 동등비교

        // 첫번째 hashCode로 비교함
        System.out.println("Dog".hashCode());
        System.out.println("Cat".hashCode());
        System.out.println("Cat".hashCode() == "Dog".hashCode()); // 다르면 그냥 다른 객체로 인식하고 종료
        // 두번쨰 equals로 비교함
        System.out.println("Dog".equals("Cat")); // 만약에 hashCode값이 동일하면 equals를 실행하여 동등
        animals.add("Dog");

        // 요소 출력
        for (String animal : animals) {
            System.out.println(animal);
        }

        // 요소 포함 여부 확인
        if (animals.contains("Cat")) {
            System.out.println("Set contains Cat");
        }

        // 크기 확인
        System.out.println("Number of animals: " + animals.size());

        // 요소 제거
        animals.remove("Bird");

        // 제거 후 요소 출력
        for (String animal : animals) {
            System.out.println(animal);
        }

        System.out.println("---------------------------");
        Set<Person> personSet = new HashSet<>();
        Person p1 = new Person("Kim", 30, "10001");
        Person p2 = new Person("Kim", 30, "10001");
        Person p3 = new Person("Lee", 35, "10002");
        System.out.println(p1.hashCode() + "/" + p2.hashCode()); // 객체참조에 대한 유일한 번호
        System.out.println(p1.equals(p2)); // 객체참조를 비교

        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);

        for (Person p : personSet) {
            System.out.println(p.getSno());
        }
    }
}