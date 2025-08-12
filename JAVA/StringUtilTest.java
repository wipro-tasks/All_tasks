package com.Assignment.Day1;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testReverseRegularString() {
        assertEquals("olleh", StringUtil.reverse("hello"));
        assertEquals("dcba", StringUtil.reverse("abcd"));
    }

    @Test
    public void testReverseEmptyString() {
        assertEquals("", StringUtil.reverse(""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReverseNullInput() {
        StringUtil.reverse(null);
    }
}
