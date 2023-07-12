package org.example.lesson6;

public class Example5 {
    public static void main(String[] args) {
        C c = (x1, x2) -> {
            System.out.println("Sum:....");
            return x1 + x2;
        };
        int sum = c.sum(1, 200);
        System.out.println(sum);
    }
}

interface C {
    int sum(int a, int b);
}