import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise8Test {

    @Test
    public void test_factorial() {

        assertEquals(new Exercise8().factorial(4), 24);
        assertEquals(new Exercise8().factorial(1), 1);
        assertEquals(new Exercise8().factorial(0), 1);

    }
}
