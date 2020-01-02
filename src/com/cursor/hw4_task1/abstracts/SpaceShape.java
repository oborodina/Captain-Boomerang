package com.cursor.hw4_task1.abstracts;

import com.cursor.hw4_task1.interfaces.AreaMeasurable;
import com.cursor.hw4_task1.interfaces.VolumeMeasurable;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    protected double z1;
    protected double x2;
    protected double y2;
    protected double z2;

    public SpaceShape (double x1, double y1, double z1, double x2, double y2, double z2) {
        super(x1, y1);
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;
    }
}

