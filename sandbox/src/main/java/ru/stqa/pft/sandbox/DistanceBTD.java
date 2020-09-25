package ru.stqa.pft.sandbox;

public class DistanceBTD {
    public static void main(String[] args) {
    double a=5;
    double b=2;
    double c=7;
    double d=4;
        System.out.println( "the distance between dot P1"+"("+a+","+b+")"+" and "+ "dot P2"+"("+c+","+d+")"+" is "+
                Distance(a,b,c,d));

    }
    public static double Distance(double a,
                                double b,
                                double c,
                                double d){
        return Math.sqrt((b-a)*(b-a)+(d-c)*(d-c));
    }

}
