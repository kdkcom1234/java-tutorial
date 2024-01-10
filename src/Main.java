import com.myuniversity.UtilSingletonEx;

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
    }
}