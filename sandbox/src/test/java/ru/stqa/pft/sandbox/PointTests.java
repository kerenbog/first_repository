package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;


public class PointTests {
    @Test
public void testDistance() {

        Point P1 = new Point(2, 6);
        Point P2 = new Point(5, 1);
        Assert.assertEquals(P1.distance2(P2),5);
    }
    @Test
public void testDistance1() {

        Point P1 = new Point(5, 6);
        Point P2 = new Point(5, 1);
        Assert.assertEquals(P1.distance2(P2),5);
    }
}