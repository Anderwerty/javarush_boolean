package org.example.lesson6;

public class Example3 {
    public static void main(String[] args) {
        new A1() {
            @Override
            public void method1() {

            }

            @Override
            public void method2() {

            }
        };
    }
}

interface A1 {

    void method1();

    void method2();

    default void method3(){
        System.out.println("method3");
    }
}

abstract class A1Impl implements A1 {

    @Override
    public void method2() {
        System.out.println("method 2");
    }
}
