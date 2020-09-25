package ru.stqa.pft.sandbox;

public class DistanceBTD {
    public static void main(String[] args) {

        Point p = new Point(5, 2, 7, 4);
        System.out.println("the distance between dot P1" + "(" + p.a + "," + p.b + ")" + " and " + "dot P2" + "(" + p.c + "," + p.d + ")" + " is " +
                p.Distance());

    }
}
