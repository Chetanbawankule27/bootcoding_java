package com.bootcoding.basic;

import org.junit.Assert;
import org.junit.Test;

public class EqualsTest {

    @Test
    public void testStringEqual() {
        Equals s1 = new Equals();
        Assert.assertEquals(true, s1.Equals("Raja"));

    }
}
