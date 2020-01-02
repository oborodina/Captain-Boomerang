package com.cursor.hw4_task1.spaceShapes;

public class Main {
    public static void main (String[] args) {
        Cuboid cuboid = new Cuboid(0, 0, 0, 1, 2, 3);
        Sphere sphere = new Sphere(0, 0, 0, 1, 2, 3);
        SquarePyramid squarePyramid = new SquarePyramid(0, 0, 0, 1, 2, 3);
        System.out.println(cuboid.toString());
        System.out.println(sphere.toString());
        System.out.println(squarePyramid.toString());

    }
}
