package com.cursor.hw4_task1.planeShapes;

import com.cursor.hw4_task1.abstracts.PlaneShape;

public class Circle extends PlaneShape {

    private double radius;
    private double PI = Math.PI;

    public Circle (double x1, double y1, double x3, double y3) {
        super(x1, y1, x3, y3);
        this.x1 = x1;
        this.y1 = y1;
        this.x3 = x3;
        this.y3 = y3;

    }

    private double getRadius () {
        radius = Math.sqrt(Math.pow(this.x3 - this.x1, 2) + Math.pow(this.y3 - this.y1, 2));
        return radius;
    }

    @Override
    public double getPerimeter () {
        getRadius();
        return 2 * PI * radius;

    }

    @Override
    public double getArea () {
        getRadius();
        return PI * Math.pow(radius, 2);

    }

    @Override
    public String toString () {
        return "Circle: " + " Radius = " + getRadius() + ";" + " Perimeter: " + getPerimeter() + ";" + " Area: " + getArea();
    }

}
