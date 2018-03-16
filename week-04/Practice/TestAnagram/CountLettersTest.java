import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {

  CountLetters myLetterCounter;

  @Before
  public void setUp() throws Exception {
    myLetterCounter = new CountLetters();
  }

  @Test
  public void countLettersTest() {
    assertEquals(2, myLetterCounter.countLetters("apple").values().toArray()[0]);
  }

  public void isPTheFirstLetter(){
    assertTrue(myLetterCounter.countLetters("apple").get(0) == 'p');
  }
}