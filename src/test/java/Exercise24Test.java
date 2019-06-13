import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Exercise24Test {
    @Test
    public void test_validNumber() {
        assertEquals(new Exercise24().countValidNumber(3), 4);
        assertEquals(new Exercise24().countValidNumber(14), 7);
    }
}
