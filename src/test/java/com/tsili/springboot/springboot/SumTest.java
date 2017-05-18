package com.tsili.springboot.springboot;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {
    private SumController sumc = new SumController();

    @Test
    public void sumTwoElements() {
        int a = 1;
        int b = 2;

        int result = sumc.sum(a, b);

        assertEquals(3, result);
    }
}
