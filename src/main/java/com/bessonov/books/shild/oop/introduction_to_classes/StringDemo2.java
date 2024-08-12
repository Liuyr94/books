package com.bessonov.books.shild.oop.introduction_to_classes;

public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "First string";
        String strOb2 = "Second string";
        String strOb3 = strOb1;
        System.out.println("Длина первой строки = " + strOb1.length());
        System.out.println("Символ по индексу 3 в строке strOb1:" + strOb1.charAt(3));
    }
}
