package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator object created");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown: Calculator object destroyed");
    }

    @Test
    public void testAdd() {
        int result = calculator.add(4, 6);

        assertEquals(10, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }
}
