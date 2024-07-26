package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testAddition() {
        int result = Main.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testAdditionNegativeNumbers() {
        int result = Main.add(-2, -3);
        assertEquals(-5, result);
    }

    @Test
    public void testAdditionZero() {
        int result = Main.add(0, 0);
        assertEquals(0, result);
    }
}
