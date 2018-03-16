import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  Anagram myAnagramChecker;

  @Before
  public void setUp() throws Exception {
    myAnagramChecker = new Anagram();
  }

  @Test
  public void isAnagramTest() {
    assertEquals(false, myAnagramChecker.isAnagram("lucky", "Lucy"));
  }

  @Test
  public void isTrueCheck() {
    assertTrue(myAnagramChecker.isAnagram("verse", "serve"));
  }

  @Test
  public void isDifferent() {
    assertNotEquals(true, myAnagramChecker.isAnagram("apple" ,"ple"));
  }
}