package com.cursor.hw4_task1.planeShapes;

import com.cursor.hw4_task1.abstracts.PlaneShape;

public class Triangle extends PlaneShape {

    private double side1;
    private double side2;
    private double side3;
    private double x2;
    private double y2;


    public Triangle (double x1, double y1, double x2, double y2, double x3, double y3) {
        super(x1, y1, x3, y3);
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    private double getSide1 () {
        this.side1 = Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2));
        return side1;
    }

    private double getSide2 () {
        this.side2 = Math.sqrt(Math.pow(this.x3 - this.x2, 2) + Math.pow(this.x3 - this.y2, 2));
        return side2;
    }

    private double getSide3 () {
        this.side3 = Math.sqrt(Math.pow(this.x3 - this.x1, 2) + Math.pow(this.y3 - this.y1, 2));
        return side3;
    }

    private void getAllSides () {
        getSide1();
        getSide2();
        getSide3();
    }

    @Override
    public double getPerimeter () {
        getAllSides();
        return side1 + side2 + side3;
    }

    @Override
    public double getArea () {
        getAllSides();
        return (side1 + side2 + side3) * 0.5;
    }

    @Override
    public String toString () {
        return "Triangle: " + " Side 1 = " + getSide1() + ";" + " Side 2 = " + getSide2() + ";" + " Side 3 = " + getSide3() + ";" + " Perimeter: " + getPerimeter() + ";" + " Area: " + getArea();
    }
}