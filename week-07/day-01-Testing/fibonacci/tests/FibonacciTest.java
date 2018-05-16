import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FibonacciTest {

    private static int fibonacciNumber;
    private static int expectedValue = 0;
    private static int actualValue = 0;

    @Before
    public void before() {
        expectedValue = 0;
        actualValue = 0;
    }

    @Test
    public void getFibonacciNumberPosIntIndexWith1() {
        expectedValue = 0;
        actualValue = Fibonacci.getFibonacciNumber(1);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getFibonacciNumberPosIntIndexWith2() {
        expectedValue = 1;
        actualValue = Fibonacci.getFibonacciNumber(2);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getFibonacciNumberPosIntIndexWith3() {
        expectedValue = 1;
        actualValue = Fibonacci.getFibonacciNumber(3);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getFibonacciNumberPosIntIndexWith4() {
        expectedValue = 2;
        actualValue = Fibonacci.getFibonacciNumber(4);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getFibonacciNumberPosIntIndexWith5() {
        expectedValue = 3;
        actualValue = Fibonacci.getFibonacciNumber(5);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getFibonacciNumberPosIntIndexWith6() {
        expectedValue = 5;
        actualValue = Fibonacci.getFibonacciNumber(6);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getFibonacciNumberPosIntIndexWith13() {
        expectedValue = 144;
        actualValue = Fibonacci.getFibonacciNumber(13);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getFibonacciNumberNegIntIndex() {
        fibonacciNumber = Fibonacci.getFibonacciNumber(-5);
        assertTrue(fibonacciNumber > 0 || fibonacciNumber == -1);
    }

    @Test
    public void getFibonacciNumberZeroIndex() {
        fibonacciNumber = Fibonacci.getFibonacciNumber(0);
        assertTrue(fibonacciNumber > 0 || fibonacciNumber == -1);
    }
}

