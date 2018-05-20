import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class CountLettersTest {

    protected String inputWord = "";
    private HashMap<Character, Integer> expectedLetterFreqDictionary = new HashMap<>();
    private HashMap<Character, Integer> actualLetterFreqDictionary = new HashMap<>();

    @Before
    public void before() {
        String inputWord = "";
        HashMap<Character, Integer> expectedLetterFreqDictionary = new HashMap<>();
        HashMap<Character, Integer> actualLetterFreqDictionary = new HashMap<>();
    }

    @After
    public void after() {
        HashMap<Character, Integer> expectedLetterFreqDictionary = null;
        HashMap<Character, Integer> actualLetterFreqDictionary = null;
    }

    @Test
    public void getLetterFreqDictionaryOnlyUppercasesOneTypeOfCharacter() {
        inputWord = "AAA";
        expectedLetterFreqDictionary.put('a', 3);
        actualLetterFreqDictionary = CountLetters.getLetterFreqDictionary(inputWord);
        assertEquals(expectedLetterFreqDictionary, actualLetterFreqDictionary);
    }

    @Test
    public void getLetterFreqDictionaryOnlyUppercasesSeveralTypesOfCharacters() {
        inputWord = "AAABBBXXX";
        expectedLetterFreqDictionary.put('a', 3);
        expectedLetterFreqDictionary.put('b', 3);
        expectedLetterFreqDictionary.put('x', 3);
        actualLetterFreqDictionary = CountLetters.getLetterFreqDictionary(inputWord);
        assertEquals(expectedLetterFreqDictionary, actualLetterFreqDictionary);
    }

    @Test
    public void getLetterFreqDictionaryOnlyUppercasesSeveralTypesOfCharacters2() {
        inputWord = "AAABBBXXXXXXHHHH";
        expectedLetterFreqDictionary.put('a', 3);
        expectedLetterFreqDictionary.put('b', 3);
        expectedLetterFreqDictionary.put('x', 6);
        expectedLetterFreqDictionary.put('h', 4);
        actualLetterFreqDictionary = CountLetters.getLetterFreqDictionary(inputWord);
        assertEquals(expectedLetterFreqDictionary, actualLetterFreqDictionary);
    }

    @Test
    public void getLetterFreqDictionaryLowerAndUpperCasesSeveralTypesOfCharacters() {
        inputWord = "AAAaBBBCDDxXX";
        expectedLetterFreqDictionary.put('a', 4);
        expectedLetterFreqDictionary.put('b', 3);
        expectedLetterFreqDictionary.put('c', 1);
        expectedLetterFreqDictionary.put('d', 2);
        expectedLetterFreqDictionary.put('x', 3);
        actualLetterFreqDictionary = CountLetters.getLetterFreqDictionary(inputWord);
        assertEquals(expectedLetterFreqDictionary, actualLetterFreqDictionary);
    }

    @Test
    public void getLetterFreqDictionaryEmptyString() {
        inputWord = "";
        actualLetterFreqDictionary = CountLetters.getLetterFreqDictionary(inputWord);
        assertEquals(expectedLetterFreqDictionary, actualLetterFreqDictionary);
    }
}

