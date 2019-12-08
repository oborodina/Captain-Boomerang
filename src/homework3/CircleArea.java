package homework3;

import static java.lang.Math.PI;

public class CircleArea {
    static int radius = 10;

    private static double calculateArea (double radius) {
        return PI * radius * radius;

    }

    public static void main (String[] args) {
        System.out.println(calculateArea(radius));

    }
}

