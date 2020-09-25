package ru.stqa.pft.sandbox;

public class Point {
    public double a;
    public double b;
    public double c;
    public double d;

    public Point(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double Distance() {
        return Math.sqrt((this.b - this.a) * (this.b - this.a) + (this.d - this.c) * (this.d - this.c));

    }
}

