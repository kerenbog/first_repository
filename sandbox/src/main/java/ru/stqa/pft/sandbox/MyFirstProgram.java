package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
     hello(" Keren");

     Square s = new Square(5);
     System.out.println("square area with side "+ s.l+ "=" + s.area());

     Rectangle r = new Rectangle(6,7);
     System.out.println("rectangle area with side "+ r.a+ " and "+"side " +r.b+ "="+ r.area());
    }

    public static void hello(String somebody) {
        System.out.println("hello," + somebody + "!");
    }

}




