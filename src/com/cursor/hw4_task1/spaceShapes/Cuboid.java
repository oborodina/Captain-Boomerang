package com.cursor.hw4_task1.spaceShapes;

import com.cursor.hw4_task1.abstracts.SpaceShape;

public class Cuboid extends SpaceShape {

    private double height = 5;
    private double width;
    private double length = 18;

    Cuboid (double x1, double y1, double z1, double x2, double y2, double z2) {
        super(x1, y1, z1, x2, y2, z2);
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;

    }

    private double getWidth () {
        this.width = Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2) + Math.pow(this.z2 - this.z1, 2));
        return width;
    }

    @Override
    public double getArea () {
        getWidth();
        return 2 * (height * width + width * length + height * length);

    }

    @Override
    public double getVolume () {
        getWidth();
        return height * width * length;

    }

    @Override
    public String toString () {
        return "Cuboid:" + " Width = " + getWidth() + " Height = " + height + " Length = " + length + " Area = " + getArea() + " Volume = " + getVolume();
    }
}


