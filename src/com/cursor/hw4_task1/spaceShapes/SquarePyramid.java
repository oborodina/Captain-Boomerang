package com.cursor.hw4_task1.spaceShapes;

import com.cursor.hw4_task1.abstracts.SpaceShape;

public class SquarePyramid extends SpaceShape {
    private double height = 10;
    private double baseSide;

    public SquarePyramid (double x1, double y1, double z1, double x2, double y2, double z2) {
        super(x1, y1, z1, x2, y2, z2);
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;
    }

    private double getBaseSide () {
        this.baseSide = Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2) + Math.pow(this.z2 - this.z1, 2));
        return baseSide;
    }

    @Override
    public double getArea () {
        getBaseSide();
        return Math.pow(baseSide, 2) + 2 * baseSide * Math.sqrt(Math.pow(baseSide, 2) / 4 + Math.pow(height, 2));
    }

    @Override
    public double getVolume () {
        getBaseSide();
        return Math.pow(baseSide, 2) * (height / 3);
    }

    @Override
    public String toString () {
        return "Square Pyramid:" + " Base Side = " + getBaseSide() + " Height = " + height + " Area =  " + getArea() + " Volume = " + getVolume();
    }
}
