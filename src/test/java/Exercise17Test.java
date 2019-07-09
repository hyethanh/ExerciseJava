import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Exercise17Test {
    @Test
    public void test_count() {
        assertEquals(new Exercise17().count(12345), 5);
        assertEquals(new Exercise17().count(2), 1);
    }

    @Test
    public void test_checkNumber() {
        assertEquals(new Exercise17().checkNumber(153), true);
        assertEquals(new Exercise17().checkNumber(407), true);
        assertEquals(new Exercise17().checkNumber(200), false);
    }

    @Test
    public void test_validNumber() {
        assertEquals(new Exercise17().validNumber(), Arrays.asList(153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084));
    }
}
