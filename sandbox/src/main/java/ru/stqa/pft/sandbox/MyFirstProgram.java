package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
     hello(" Keren");

     Square s = new Square(5);
     System.out.println("square area with side "+ s.l+ "=" + area(s));

     Rectangle r = new Rectangle(6,7);
     System.out.println("rectangle area with side "+ r.a+ " and "+"side " +r.b+ "="+ area(r));
    }
    public static double area(Square s) {
         return  s.l* s.l;
    }
    public static double area(Rectangle r) {
        return  r.a* r.b;
    }



    public static void hello(String somebody) {
        System.out.println("hello," + somebody + "!");
    }

}




