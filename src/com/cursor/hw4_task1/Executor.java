package com.cursor.hw4_task1;

import com.cursor.hw4_task1.abstracts.Shape;
import com.cursor.hw4_task1.planeShapes.Circle;
import com.cursor.hw4_task1.planeShapes.Rectangle;
import com.cursor.hw4_task1.planeShapes.Triangle;
import com.cursor.hw4_task1.spaceShapes.Cuboid;
import com.cursor.hw4_task1.spaceShapes.Sphere;
import com.cursor.hw4_task1.spaceShapes.SquarePyramid;

public class Executor {
    public static void executeShapes (){
        Shape triangle = new Triangle(1, 1, 4, 4, 5, 1);
        Shape rectangle = new Rectangle(1, 1, 1, 4, 5, 1);
        Shape circle = new Circle(1, 1, 5, 1);
        Shape cuboid = new Cuboid(0, 0, 0, 1, 2, 3);
        Shape sphere = new Sphere(0, 0, 0, 1, 2, 3);
        Shape squarePyramid = new SquarePyramid(0, 0, 0, 1, 2, 3);
        System.out.println(triangle.toString());
        System.out.println(rectangle.toString());
        System.out.println(circle.toString());
        System.out.println(cuboid.toString());
        System.out.println(sphere.toString());
        System.out.println(squarePyramid.toString());
    }
}
