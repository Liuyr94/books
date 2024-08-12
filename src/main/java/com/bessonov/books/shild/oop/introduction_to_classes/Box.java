package com.bessonov.books.shild.oop.introduction_to_classes;

public class Box {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        System.out.println("Конструирование Box");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box(Box box) {
        width = box.width;
        height = box.height;
        depth = box.depth;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);
        Box myClone = new Box(myBox1);
        System.out.println("Объем первой коробки: " + myBox1.volume());
        System.out.println("Объем второй коробки: " + myBox2.volume());
        System.out.println("Объем кубика: " + myCube.volume());
    }
}