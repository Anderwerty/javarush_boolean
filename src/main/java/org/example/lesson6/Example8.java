package org.example.lesson6;

import java.util.function.Function;

public class Example8 {
    public static void main(String[] args) {
        Function<String, Integer> symbolCounter1 =(text) ->{
            System.out.println("Start ...");

            return text.length();
        };

        Function<String, Integer> symbolCounter2 = (text)->new Example8().nonStaticCounter(text);
        Function<String, Integer> symbolCounter3 = new Example8()::nonStaticCounter;
        Function<String, Integer> symbolCounter4 = Example8::staticCounter;


        Integer helloCount = symbolCounter1.apply("Hello");
        System.out.println(helloCount);


        System.out.println(symbolCounter2.apply("Hello"));
    }

    public int nonStaticCounter(String message){
        System.out.println("Start ...");

        return message.length();
    }

    public static int staticCounter(String message){
        System.out.println("Start ...");

        return message.length();
    }
}


