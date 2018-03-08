import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

    Apple myApple;

    @Before
    public void SetUp(){
        myApple = new Apple("apple");
    }

    @Test
    public void getAppleTest() {
        assertEquals("apple", myApple.getApple());
    }
    
}