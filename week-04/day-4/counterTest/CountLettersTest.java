import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountLettersTest {

    CountLetters newCounter;

    @Before
    public void setUp() throws Exception {
        newCounter = new CountLetters("naaaame");
    }

    @Test
    public void dictionaryTestIfEquals() {
        assertEquals(1, newCounter.dictionary().values().toArray()[1]);
    }

    @Test
    public void dictionaryTestIfFalse() {
        assertFalse("2" == newCounter.dictionary().values().toArray()[2]);
    }
}