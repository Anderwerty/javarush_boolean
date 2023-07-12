package org.example.lesson6;

import java.util.Arrays;
import java.util.List;

public class Example9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,-1,7,6,4,3,4,9,0);

        list.forEach(System.out::println);
    }
}
