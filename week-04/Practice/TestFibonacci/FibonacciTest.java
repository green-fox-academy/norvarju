import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

  Fibonacci myFibonacciChecker;

  @Before
  public void setUp() throws Exception {
    myFibonacciChecker = new Fibonacci();
  }

  @Test
  public void nthMemberOfFibonacciSequenceTest() {
    assertEquals(233, myFibonacciChecker.nthMemberOfFibonacciSequence(13));
  }

  @Test
  public void is16thElement988() {
    assertFalse(myFibonacciChecker.nthMemberOfFibonacciSequence(16) == 988);
  }

  @Test
  public void is15thElement610() {
    assertTrue(myFibonacciChecker.nthMemberOfFibonacciSequence(15) == 610);
  }

  @Test
  public void thirdMemberCheck() {
    assertNotEquals(3, myFibonacciChecker.nthMemberOfFibonacciSequence(3));
  }
}