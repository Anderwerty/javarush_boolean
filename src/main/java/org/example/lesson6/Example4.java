package org.example.lesson6;

import java.util.ArrayList;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        B b = (message,  times) -> {
            for (int i = 1; i <= times; i++) {
                System.out.println(message);
            }
        };

        b.print("Hello", 5);

        System.out.println(b.getClass());
        System.out.println(b.equals(b));
    }
}

@FunctionalInterface
interface B {
   public static final int value =10;
    void print(String message, int times);

    default void method() {
    }

    static void staticMethod(){

    }
}
