package com.myuniversity;

// 인스턴스 1개만 사용하기 위한 디자인(코드설계) 패턴 - 객체 생성패턴
// 첫번째 객체생성 요청시에만 객체를 생성하여
// 그다음부터는 이전에 생성한 객체를 반환
public class UtilSingletonEx {
    // 2. 현재 클래스 객체를 필드 선언
    private static UtilSingletonEx util;

    // 1. 기본 생성자를 private으로 만들어서 외부에서 직접 객체 생성을 못하게 막음
    private UtilSingletonEx() {
    }

    // 3. 객체를 리턴하는 메서드
    // 현재 클래스 객체가 null이면 객체를 생성하여 리턴
    // null이 아니면 이미 생성된 객체를 리턴
    // 객체 생성 방법을 숨기는 역할도 함
    public static UtilSingletonEx getInstance() {
        if(util == null) {
            util = new UtilSingletonEx();
        }
        return util;
    }

    // non-static 메서드
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}

