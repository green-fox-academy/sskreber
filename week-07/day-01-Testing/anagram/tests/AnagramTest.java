import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    Anagram anagram;

    @Before
    public void before() {
        Anagram anagram = new Anagram();
    }

    @After
    public void after() {
        Anagram anagram = null;
    }

    @Test
    public void isAnagram() {
        String word1 = "God";
        String word2 = "dog";
        boolean expectedAnswer = true;
        boolean actualAnswer = anagram.isAnagram(word1, word2);
        assertEquals("Anagram state assertion is wrong", expectedAnswer, actualAnswer);
    }
}

