package animals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MammalTest {

    protected String expectedValue = "";
    protected String actualValue = "";
    Mammal mammal = new Mammal("");

    @Before
    public void before() {
        expectedValue = "";
        actualValue = "";
        Mammal mammal = new Mammal("");
    }

    @After
    public void after() {
        expectedValue = "";
        actualValue = "";
        Mammal mammal = null;
    }

    @Test
    public void testGetName() {
        Mammal mammal = new Mammal("Koala");
        expectedValue = "Koala";
        actualValue = mammal.getName();
    }

    @Test
    public void testGetGender() {
        Mammal mammal = new Mammal("Koala");
        mammal.setGender(Animal.Gender.MALE);
        expectedValue = "MALE";
        actualValue = mammal.getName();
    }

    @Test
    public void mammalTestIntroduce() {
        Mammal mammal = new Mammal("Giraffe");
        mammal.setAge(8);
        mammal.setGender(Animal.Gender.MALE);

        expectedValue = "Hi, I am a(n) Giraffe, I am a(n) mammal. I am a 8 year old male!";
        actualValue = mammal.introduce();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void mammalTestIntroduce2() {
        Mammal mammal = new Mammal("Cow");
        mammal.setAge(1);
        mammal.setGender(Animal.Gender.FEMALE);

        expectedValue = "Hi, I am a(n) Cow, I am a(n) mammal. I am a 1 year old female!";
        actualValue = mammal.introduce();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void mammalTestIntroduceEmpty() {
        Mammal mammal = new Mammal();
        mammal.setAge(5);
        expectedValue = "Sorry, I cannot introduce myself without sufficient data.";
        actualValue = mammal.introduce();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void mammalTestbreed() {
        Mammal mammal = new Mammal("Delphin");
        expectedValue = "A Delphin is breeding by pushing miniature versions out.";
        actualValue = ("A " + mammal.getName() + " is breeding by " + mammal.breed());
    }

    @Test
    public void mammalTestbreedEmpty() {
        Mammal mammal = new Mammal();
        expectedValue = "A is breeding by pushing miniature versions out.";
        actualValue = ("A " + mammal.getName() + " is breeding by " + mammal.breed());
    }
}

