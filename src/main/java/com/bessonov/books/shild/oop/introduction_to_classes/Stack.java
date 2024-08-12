package com.bessonov.books.shild.oop.introduction_to_classes;

public class Stack {
    private int[] stck;
    private int tos;

    //Инициализировать верхушку Стека
    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    //Поместить элемент в стек
    void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Стек полон");
            return;
        }

        stck[++tos] = item;
    }

    int extract() {
        if (tos < 0) {
            System.out.println("Стек опустошен");
            return 0;
        }
        return stck[tos--];
    }
}

class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack(12);
        Stack myStack2 = new Stack(12);

        //Помещаем числа в стек.
        for (int i = 0; i < 10; i++) {
            myStack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            myStack2.push(i);
        }

        //Извлекаем числа из стека
        System.out.println("Стек в myStack1:");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack1.extract());
        }
        System.out.println("Стек в myStack1:");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack2.extract());
        }
    }
}