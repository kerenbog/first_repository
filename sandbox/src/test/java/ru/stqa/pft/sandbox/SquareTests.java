package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;

public class SquareTests {

    @Test
    public void testArea(){
        Square g= new Square(5);
        assert g.area()==25;
    }

}
