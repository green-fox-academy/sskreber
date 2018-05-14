import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {
    private Apples myApple;

    @Before
    public void before() {
        myApple = new Apples();
    }

    @After
    public void after() {
        myApple = null;
    }

    @Test
    public void doesGetAppleWork() {
        String expectedValue = "bunch of apples";
        String actualValue = myApple.getApple();
        assertEquals("it doesn't return the expected string", expectedValue, actualValue);
    }
}
