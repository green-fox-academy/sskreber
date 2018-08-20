package animals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BirdTest {

    protected String expectedValue = "";
    protected String actualValue = "";
    Bird bird = new Bird("");

    @Before
    public void before() {
        expectedValue = "";
        actualValue = "";
        Bird bird = new Bird("");
    }

    @After
    public void after() {
        expectedValue = "";
        actualValue = "";
        Bird bird = null;
    }

    @Test
    public void birdTestIntroduce() {
        Bird bird = new Bird("Raven");
        bird.setAge(3);
        bird.setGender(Animal.Gender.MALE);

        expectedValue = "Hi, I am a(n) Raven, I am a(n) bird. I am a 3 year old male!";
        actualValue = bird.introduce();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void birdTestIntroduce2() {
        Bird bird = new Bird("Parrot");
        bird.setAge(1);
        bird.setGender(Animal.Gender.FEMALE);

        expectedValue = "Hi, I am a(n) Parrot, I am a(n) bird. I am a 1 year old female!";
        actualValue = bird.introduce();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void birdTestIntroduceEmpty() {
        Bird bird = new Bird();

        expectedValue = "Sorry, I cannot introduce myself without sufficient data.";
        actualValue = bird.introduce();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void birdTestbreed() {
        Bird bird = new Bird("Parrot");
        expectedValue = "A Parrot is breeding by laying eggs.";
        actualValue = ("A " + bird.getName() + " is breeding by " + bird.breed());
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void birdTestbreedEmpty() {
        Bird bird = new Bird();
        expectedValue = "A null is breeding by laying eggs.";
        actualValue = ("A " + bird.getName() + " is breeding by " + bird.breed());
        assertEquals(expectedValue, actualValue);
    }

}

