package com.study.example;

@FunctionalInterface // 인터페이스를 더 견고하게 관리하기 위해 , 함수형 인터페이스를 정의한 경우
public interface RunSomething {
    // 추상메서드가 딱 하나만 있으면 함수형 인터페이스
    // 다른 메서드가 몇개 있던지 상관없음 무조건 추상메서드 1개 -> 함수형 인터페이스
    void doIt(int num);

    static void printName() {
        System.out.println("jinseong");
    }

    default void printAge() {
        System.out.println("26");
    }
}
