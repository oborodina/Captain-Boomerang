package com.cursor.hw4_task1.planeShapes;


public class Main {
    public static void main (String[] args) {

        Triangle triangle = new Triangle(1, 1, 4, 4, 5, 1);
        Rectangle rectangle = new Rectangle(1, 1, 1, 4, 5, 1);
        Circle circle = new Circle(1, 1, 5, 1);
        System.out.println(triangle.toString());
        System.out.println(rectangle.toString());
        System.out.println(circle.toString());
    }
}
