package org.example.lesson6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example10 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 2, 30, -1, 2, -100);


        Stream<Integer> integerStream = integers.stream()
                .filter(item -> item >= 0)
                .filter(x -> x % 2 == 0);
//        List<String> collect1 = integerStream
//                .map("_"::repeat)
//                .collect(Collectors.toList());
//
//        System.out.println(collect1);
//        List<String> collect2 = integerStream
//                .map("="::repeat)
//                .collect(Collectors.toList());

//        System.out.println(collect2);

    }


}
