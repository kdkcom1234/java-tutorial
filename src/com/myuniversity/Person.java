package com.myuniversity;

// 사람 정보를 처리
// 객체를 만들기 위한 틀(템플릿)
public class Person {
    // 필드(fields)
    // private, public
    // private필드: 객체 내부에서만 접근 가능
    // public필드: 객체 외부에서 접근 가능


    // 자바에서 클래스 설계관점이 강함
    // 설계한대로 클래스 만들고, -> 쓰는 사람은 형식대로 사용해라...
    // 필드(데이터, 값, 상태)는 접근 못하게 일단 막는다.

    // 자바에서 필드값을 일단 다 숨김(객체 외부에서는 접근이 불가능함, private)
    // 메서드로 필드값을 접근할 수게 열어 놓음(public, ...)

    // 정보은닉(information hiding)
    // 일단 다 숨기고, 필요하면 접근가능하게 한다. -> 메서드로 접근 가능하게 한다.
    // 데이터를 숨긴다.(필드)
    // 구현을 세부 사항을 숨긴다. (메서드)

    // 캡슐화(encapsulation)
    // -> 객체에 값이 가지는 필드와 기능을 처리하는 메서드를 둔다.
    // 캡슐화 해놓은 객체를 -> 정보은닉

    // 접근 제한자, 접근 제어자(access modifier, visibility)

    // class
    // public: 어느서든지 접근 가능
    // default(package-private): 패키지내에서만 접근 가능

    // field/method
    // public: 외부 클래스(객체)에서 접근 가능
    // private: 클래스(객체) 내에서만 접근 가능
    // default(package-private): 패키지내에서만 접근 가능
    // protected: default + 상속받은 클래스(객체)에서 접근 가능
    private String name;
    protected int age;
    private String sno; // 주민번호


    // 생성자(Constructor)
    // 1. (용도) 객체를 생성할 때 사용하는 메서드
    // 2. (특징) 클래스 이름과 동일한 이름을 가지는 메서드
    // 3. (관례) 주로 객체의 필드 값을 초기화할 때 사용

    // com.myuniversity.Person(age = 37)
    public Person(String name, int age) {
        // this: 현재 객체
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String sno) {
        // this: 현재 객체
        this.name = name;
        this.age = age;
        this.sno = sno;
    }

    public String getSno() {
        return sno;
    }

    @Override
    public int hashCode() {
        // 객체별로 유일한 값에 대한 hashCode();
        // 이름.hashCode() + 전화번호.hashCode()
        return this.sno.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        Person p = (Person) obj; // Object -> Person
        return this.sno.equals(p.getSno());
    }

    // 생성자 오버로딩
    public Person() {
        this.name = "";
        this.age = 0;
    }

    // getter, 필드값을 읽어오는 메서드(필드값을 반환)
    // public 필드의데이터타입 get필드명() { return this.필드명; }
    public String getName() {
        return this.name;
    }

    // setter, 필드값을 설정하는 메서드(반환값이 없음)
    // public void set필드명(필드데이터타입 필드명) { this.필드명 = 필드명  }
    public void setName(String name) {
        this.name = name;
    }

    // getter만 있음. 생성할 때 초기화되고 변경 불가. 조회만됨
    public int getAge() {
        return  this.age;
    }

    // 메서드(methods)
    // 사람 정보 출력
    public void printInfo() {
        // 필드에 접근할 때는 this.필드명으로 써주는게 좋다.
        // 메서드 내의 선언한 변수와 헷갈리지 않기 위해서
        System.out.println(this.name + "/" + this.age);
    }
}
