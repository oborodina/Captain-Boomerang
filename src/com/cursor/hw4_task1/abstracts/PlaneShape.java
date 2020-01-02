package com.cursor.hw4_task1.abstracts;

import com.cursor.hw4_task1.interfaces.AreaMeasurable;
import com.cursor.hw4_task1.interfaces.PerimeterMeasurable;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    protected double x3;
    protected double y3;

    public PlaneShape (double x1, double y1, double x3, double y3) {
        super(x1, y1);
        this.x1 = x1;
        this.y1 = y1;
        this.x3 = x3;
        this.y3 = y3;
    }

}
