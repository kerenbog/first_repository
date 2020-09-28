package ru.stqa.pft.sandbox;

public class DistanceBTD2 {

    public static void main(String[] args) {
        Point2 P1 = new Point2(5,2);
        Point2 P2 = new Point2(6,7);
        System.out.println("the distance between point P1" + "(" + P1.a + "," + P1.b + ")" + " and " + "point P2" + "(" + P2.a + "," + P2.b + ")" + " is " +
                distance2(P1,P2));


    }

    public static double distance2(Point2 P1, Point2 P2) {
        return Math.sqrt((P2.a- P1.a) * (P2.a - P1.a) + (P2.b - P1.b) * (P2.b - P1.b));
    }
}