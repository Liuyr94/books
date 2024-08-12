package com.bessonov.books.shild.oop.introduction_to_classes;

public class RecTest {
    int[] values;

    RecTest(int i) {
        values = new int[i];
    }

    void printArray(int i) {
        if (i == 0) return;
        printArray(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }
}

class Recursion2 {
    public static void main(String[] args) {
        RecTest rt = new RecTest(10);
        int j;
        for (j = 0; j < rt.values.length; j++) rt.values[j] = j;
        rt.printArray(j);
    }
}