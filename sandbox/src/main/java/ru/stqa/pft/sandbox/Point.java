package ru.stqa.pft.sandbox;

public class Point {

public double a;
public double b;

public Point(double a1,double b1){
    this.a=a1;
    this.b=b1;
    }

    public double distance2(Point P1){
        return Math.sqrt((P1.a- this.a)*(P1.a- this.a)+(P1.b- this.b)*(P1.b- this.b));
    }
}

