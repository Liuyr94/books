package com.bessonov.books.shild.oop.introduction_to_classes;

public class Test {
    int a;

    Test(int a) {
        this.a = a;
    }

    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }
}

class PassOb {
    public static void main(String[] args) {
        Test ob1 = new Test(2);
        Test ob2 = ob1.incrByTen();
        System.out.println("ob.a : " + ob1.a);
        System.out.println("ob2.a : " + ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println("ob2.a : " + ob2.a);
    }
}