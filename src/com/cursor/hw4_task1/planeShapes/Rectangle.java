package com.cursor.hw4_task1.planeShapes;

import com.cursor.hw4_task1.abstracts.PlaneShape;

public class Rectangle extends PlaneShape {

    private double side1;
    private double side2;
    private double x4;
    private double y4;

    public Rectangle (double x1, double y1, double x4, double y4, double x3, double y3) {
        super(x1, y1, x3, y3);
        this.x1 = x1;
        this.y1 = y1;
        this.x4 = x4;
        this.y4 = y4;
        this.x3 = x3;
        this.y3 = y3;
    }

    private double getSide1 () {
        side1 = Math.sqrt(Math.pow(this.x4 - this.x1, 2) + Math.pow(this.y4 - this.y1, 2));
        return side1;
    }

    private double getSide2 () {
        side2 = Math.sqrt(Math.pow(this.x3 - this.x1, 2) + Math.pow(this.y3 - this.y1, 2));
        return side2;
    }

    private void getAllSides () {
        getSide1();
        getSide2();
    }

    @Override
    public double getPerimeter () {
        getAllSides();
        return 2 * (side1 + side2);
    }

    @Override
    public double getArea () {
        getAllSides();
        return side1 * side2;
    }

    @Override
    public String toString () {
        return "Rectangle: " + " Side 1 = " + getSide1() + ";" + " Side 2 = " + getSide2() + ";" + " Perimeter: " + getPerimeter() + ";" + " Area: " + getArea();
    }
}
