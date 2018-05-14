import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

    public Sum summary1;

    @Before
    public void before() {
        summary1 = new Sum();
    }

    @After
    public void after() {
        summary1 = null;
    }

    @Test
    public void sum() {
        ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(5, 5, 10, 10, 20));
        int expectedValue = 50;
        int actualValue = summary1.sum(listOfNumbers);
        assertEquals("Sum is incorrect", expectedValue, actualValue);
    }

    @Test
    public void sumOfEmptyList() {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        int expectedValue = 0;
        int actualValue = summary1.sum(listOfNumbers);
        assertEquals("Sum is incorrect", expectedValue, actualValue);
    }

    @Test
    public void sumOfOneNumber() {
        ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(15));
        int expectedValue = 15;
        int actualValue = summary1.sum(listOfNumbers);
        assertEquals("Sum is incorrect", expectedValue, actualValue);
    }

    @Test
    public void sumOfMultipleNumbers() {
        ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(0, 1, 2, 10, 20));
        int expectedValue = 33;
        int actualValue = summary1.sum(listOfNumbers);
        assertEquals("Sum is incorrect", expectedValue, actualValue);
    }

    @Test
    public void sumOfNullList() {
        try {
            ArrayList<Integer> listOfNumbers = new ArrayList<>(null);
            int expectedValue = 0;
            int actualValue = summary1.sum(listOfNumbers);
            assertNotNull(listOfNumbers);
        } catch (NullPointerException NullPointerException) {
            System.out.println("Well, this list appears to be null.");
        }
    }
}

