import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest3 {

    Sum newSum3;

    @Before
    public void setUp() throws Exception {
        newSum3 = new Sum();
        newSum3.addNumbers(6);
    }

    @Test
    public void sumOfElementsTest() {
        assertEquals(6, newSum3.sumOfElements());
    }
}