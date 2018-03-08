import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    Anagram anagramChecker;

    @Before
    public void setUp() throws Exception {
        anagramChecker = new Anagram("nam", "mane");
    }

    @Test
    public void anagramMakerTest() {
        assertEquals(false, anagramChecker.anagramMaker());
    }
}