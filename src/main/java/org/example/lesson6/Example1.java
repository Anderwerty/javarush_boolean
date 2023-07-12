package org.example.lesson6;

public class Example1 {
    public static void main(String[] args) {
        A a = new AImpl();

        A a1 = new A() {
            @Override
            public void method() {
                System.out.println(" option 2");
            }
        };
        A a2 = new A() {
            @Override
            public void method() {
                System.out.println(" option 3");
            }
        };


        a.method();
        a1.method();

        System.out.println(a.getClass());
        System.out.println(a1.getClass());
        System.out.println(a2.getClass());

    }
}

interface A {
    void method();
}

class AImpl implements A {

    @Override
    public void method() {
        System.out.println("method implementation");
    }
}