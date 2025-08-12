package com.Assignment.Day1;

import static org.junit.Assert.*;
import org.junit.Test;

public class MathUtilTest {

    @Test
    public void testFactorialValidInputs() {
        assertEquals(1, MathUtil.factorial(0));
        assertEquals(1, MathUtil.factorial(1));
        assertEquals(6, MathUtil.factorial(3));
        assertEquals(120, MathUtil.factorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegativeInput() {
        MathUtil.factorial(-1);
    }
}

