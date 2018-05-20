package animals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReptileTest {

    protected String expectedValue = "";
    protected String actualValue = "";
    Reptile reptile = new Reptile("");

    @Before
    public void before() {
        expectedValue = "";
        actualValue = "";
        Reptile reptile = new Reptile("");
    }

    @After
    public void after() {
        expectedValue = "";
        actualValue = "";
        Reptile reptile = null;
    }

    @Test
    public void testGetName() {
        Reptile reptile = new Reptile("Serpent");
        expectedValue = "Serpent";
        actualValue = reptile.getName();
    }

    @Test
    public void reptileTestIntroduce() {
        Reptile reptile = new Reptile("Crocodile");
        reptile.setAge(2);
        reptile.setGender(Animal.Gender.MALE);

        expectedValue = "Hi, I am a(n) Crocodile, I am a(n) reptile. I am a 2 year old male!";
        actualValue = reptile.introduce();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void reptileTestIntroduce2() {
        Reptile reptile = new Reptile("Gekko");
        reptile.setAge(6);
        reptile.setGender(Animal.Gender.FEMALE);

        expectedValue = "Hi, I am a(n) Gekko, I am a(n) reptile. I am a 6 year old female!";
        actualValue = reptile.introduce();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void reptileTestIntroduceAlmostEmpty() {
        Reptile reptile = new Reptile("Crocodile");

        expectedValue = "Sorry, I cannot introduce myself without sufficient data.";
        actualValue = reptile.introduce();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void reptileTestbreed() {
        Reptile reptile = new Reptile("Walrus");
        expectedValue = "A Walrus is breeding by laying eggs.";
        actualValue = ("A " + reptile.getName() + " is breeding by " + reptile.breed());
    }

    @Test
    public void reptileTestbreedEmpty() {
        Reptile reptile = new Reptile();
        expectedValue = "A is breeding by pushing miniature versions out.";
        actualValue = ("A " + reptile.getName() + " is breeding by " + reptile.breed());
    }
}

