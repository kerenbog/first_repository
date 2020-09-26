package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

    @Test
    public void testArea(){
        Square g= new Square(5);
        Assert.assertEquals(g.area(),25.0);
    }

}
