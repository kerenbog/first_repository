package ru.stqa.pft.sandbox;

public class DistanceBTD {
    public static void main(String[] args) {
        Point P1= new Point(5,6);
        Point P2 = new Point(5,1);
        System.out.println(distance(P1,P2));
        System.out.println(P1.distance2(P2));
    }

    public static double distance (Point P1,Point P2){
        return Math.sqrt((P1.a- P2.a)*(P1.a- P2.a)+(P1.b- P2.b)*(P1.b- P2.b));

    }
}
