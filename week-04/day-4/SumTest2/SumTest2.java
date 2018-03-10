import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest2 {

    Sum newSum2;

    @Before
    public void setUp() throws Exception {
        newSum2 = new Sum();

    }

    @Test
    public void sumOfElementsTest() {
        assertEquals(0, newSum2.sumOfElements());
    }
}