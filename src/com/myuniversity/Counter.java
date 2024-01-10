package com.myuniversity;

public class Counter {
    // static 변수
    // static 필드는 클래스 공간에 공유가 된다.
    private static int count = 0;
    private String name = "";

    public Counter(String name) {
        this.name = name;
        count++;
    }

    // static 메서드
    // static 메서드의 사용은 인스턴스(객체) 생성없이 클래스명.메서드명(..) 호출 가능
    public static int getCount() {
        return count;
    }

    public String getName() {
        return this.name;
    }
}
