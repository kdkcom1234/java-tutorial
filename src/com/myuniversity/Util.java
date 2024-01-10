package com.myuniversity;

public class Util {
    // final 값 또는 참조 변경 불가인 필드에 넣는 키워드
    // 상수(contants)

    // 변수 명칭을 snake-case 대문자
    // MAX_SUM_VALUE

    // static 메서드에서 상수값을 사용하는경우가 많기 때문에 static으로 선언하는 경우가 많음
    public static final double PI = 3.14192;

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double area(double radius) {
        return PI * radius * radius;
    }

//    public void set() {
//        this.PI = 111; // error
//    }
}
