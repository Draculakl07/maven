package com.avi.sonar.MavenSonar;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void testAdd() {
    	Addition addition = new Addition();
        addition.a = 5;
        addition.b = 10;
        addition.add();
        int result = addition.c;
        Assert.assertEquals(15, result);

    }

//    @Test
//    public void testSubtract() {
//        App app = new App();
//        int result = app.subtract(5, 3);
//        Assert.assertEquals(2, result);
//    }
//
//    @Test
//    public void testMultiply() {
//        App app = new App();
//        int result = app.multiply(4, 2);
//        Assert.assertEquals(8, result);
//    }
//
//    @Test
//    public void testDivide() {
//        App app = new App();
//        int result = app.divide(10, 2);
//        Assert.assertEquals(5, result);
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testDivideByZero() {
//        App app = new App();
//        app.divide(10, 0);
//    }
}
