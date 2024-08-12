package com.bessonov.books.shild.oop.introduction_to_classes;

public class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

//    void test(int a) {
//        System.out.println("a: " + a);
//    }

    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println("double a: " + a);
    }
}

class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;
        ob.test();
        ob.test(i);
        ob.test(10, 20);
        ob.test(1213.2);
    }
}
