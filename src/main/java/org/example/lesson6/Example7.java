package org.example.lesson6;

public class Example7 {
    public static void main(String[] args) {
        Comparable<Container> comparable = new Comparable<>() {
            @Override
            public int compareTo(Container that) {
                return 0;
            }
        };
    }

    public static void sort(Container[] items) {
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items.length - i - 1; j++) {
                swap(i, j, items);
            }
        }
    }

    private static void swap(int i, int j, Container[] items) {

        if (items[i].compareTo(items[j]) > 0) {
            Container temp = items[i];
            items[i] = items[j];
            items[j] = temp;
        }
    }
}

class Container implements Comparable<Container> {
    public final int value;

    Container(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Container that) {
        return this.value - that.value;
    }
}
