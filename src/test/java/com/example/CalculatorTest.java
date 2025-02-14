package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        Assert.assertEquals(result, 5, "2 + 3 should equal 5");
    }
}
