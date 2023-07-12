package org.example.lesson6;

public class Example6 {
    public static void main(String[] args) {

    }

    public static void sort(int[] items) {
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items.length - i - 1; j++) {
                swap(i, j, items);
            }
        }
    }

    private static void swap(int i, int j, int[] items) {

        if (items[i] > items[j]) {
            int temp = items[i];
            items[i] = items[j];
            items[j] = temp;
        }
    }
}
