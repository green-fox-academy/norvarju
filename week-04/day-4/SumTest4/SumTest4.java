import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest4 {

    Sum newSum4;

    @Before
    public void setUp() throws Exception {
        newSum4 = new Sum();
        newSum4.addNumbers(6);
    }

    @Test (expected = NullPointerException.class)
    public void sumOfElementsTest() {
        assertEquals(6, newSum4.sumOfElements());
    }
}