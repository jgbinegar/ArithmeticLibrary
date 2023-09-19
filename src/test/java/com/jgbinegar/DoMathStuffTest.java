package com.jgbinegar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoMathStuffTest {

    @Test
    void addTest() {
        assertEquals(DoMathStuff.add(15, 17.257), 15 + 17.257);
        assertEquals(DoMathStuff.add(72, 68), 72 + 68);
        assertEquals(DoMathStuff.add(12057, 15.22275), 12057 + 15.22275);
    }

    @Test
    void subtractTest() {
        assertEquals(DoMathStuff.subtract(215, 219.7), 215 - 219.7);
        assertEquals(DoMathStuff.subtract(10, 8), 10 - 8);
        assertEquals(DoMathStuff.subtract(1997, 1854.263), 1997 - 1854.263);
    }

    @Test
    void multiplyTest() {
        assertEquals(DoMathStuff.multiply(27, 15.25), 27 * 15.25);
        assertEquals(DoMathStuff.multiply(27, 17.64), 27 * 17.64);
        assertEquals(DoMathStuff.multiply(27, 192.168), 27 * 192.168);
    }

    @Test
    void divideTest() {
        assertEquals(DoMathStuff.divide(99872, 15.284), 99872 / 15.284);
        // This assertion fails unless the .0 is added to the end. That is because of how arithmetic is done and displayed
        // in Java, and not any fault of the user.
        assertEquals(DoMathStuff.divide(99872, 1024), 99872 / 1024.0);
        // This shows the issue stated above.
        assertNotEquals(DoMathStuff.divide(99872, 1024), 99872 / 1024);
        assertEquals(DoMathStuff.divide(99872, 19.648), 99872 / 19.648);
    }

}