package com.cursor.hw4_task1.spaceShapes;

import com.cursor.hw4_task1.abstracts.SpaceShape;

public class Sphere extends SpaceShape {
    private double PI = Math.PI;
    private double radius;

    Sphere (double x1, double y1, double z1, double x2, double y2, double z2) {
        super(x1, y1, z1, x2, y2, z2);
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;
    }

    private double getRadius () {
        this.radius = Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2) + Math.pow(this.z2 - this.z1, 2));
        return radius;
    }

    @Override
    public double getArea () {
        getRadius();
        return 4 * PI * Math.pow(radius, 2);

    }

    @Override
    public double getVolume () {
        getRadius();
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString () {
        return "Sphere: " + " Width = " + getRadius() + " Area = " + getArea() + " Volume = " + getVolume();
    }
}
