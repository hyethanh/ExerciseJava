import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Exercise21Test {
    @Test
    public void test_validNumber() {
        assertEquals(new Exercise21().validNumber(3), 4);
        assertEquals(new Exercise21().validNumber(14), 7);
    }
}
