public class Main {
    public static void main(String[] args) {
        // 생성자를 이용하여 객체를 생성
        // 클래스명 변수명(객체명-object,인스턴스명-instance)
        // 인스턴스: 어떤 형식을 찍어낸 메모리 공간을 인스턴스라고 함
        // 필드의 초기값을 생성자에 매개변수를 넘겨서 초기화 함
        Person p = new Person("Kim", 30);

//        // 필드 직접 접근
//        p.name = "Lee"; // 필드값 변경
//        System.out.println(p.name); // 필드값 조회
//        p.printInfo();

        // getter/setter로 접근
        p.setName("Hong"); // 필드값 변경
        System.out.println(p.getName()); // 필드값 조회
        System.out.println(p.getName() + "/" + p.getAge()); // 출력형식
        p.printInfo(); // 출력형식 내장
    }
}