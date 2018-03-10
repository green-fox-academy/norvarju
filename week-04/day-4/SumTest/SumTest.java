import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

    Sum newSum;

    @Before
    public void setUp() throws Exception {
        newSum = new Sum();
        newSum.addNumbers(1);
        newSum.addNumbers(2);
        newSum.addNumbers(3);
    }

    @Test
    public void sumOfElementsTest() {
        assertEquals(6, newSum.sumOfElements());
    }
}