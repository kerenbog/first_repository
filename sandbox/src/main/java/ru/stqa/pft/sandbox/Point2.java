package ru.stqa.pft.sandbox;

public class Point2 {
    public double a;
    public double b;


    public Point2 (double x,double y){
    this.a=x;
    this.b=y;

    }
    public double distance2(){
        return Math.sqrt((this.a- this.a) * (this.a - this.a) + (this.b - this.b) * (this.b - this.b));


    }
}
