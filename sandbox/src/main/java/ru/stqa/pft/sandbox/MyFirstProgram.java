package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello(" Keren");

     double len = 5;
        System.out.println("square area with side"+ len+ "=" + area(len));
     double a=6;
     double b=7;
        System.out.println("rectangle area with side "+a+" and "+"side "+b+ "=" + area(a,b));

    }
    public static double area(double l) {
         return  l*l;
    }

    public static double area (double a,double b){
        return a*b;
    }

    public static void hello(String somebody) {
        System.out.println("hello," + somebody + "!");
    }

}




