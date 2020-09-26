package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;


public class PointTests {
    @Test

    public void PointTest (){
        Point k= new Point(5,2,7,4);
        Assert.assertEquals(k.Distance(), -5);
    }
}
