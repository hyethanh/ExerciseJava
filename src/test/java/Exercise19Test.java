import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Exercise19Test {
    @Test
    public void test_C() {
        assertEquals(new Exercise19().c(1, 2), 2);
        assertEquals(new Exercise19().c(2, 5), 10);
        assertEquals(new Exercise19().c(0, 3), 1);
    }

    @Test
    public void test_pascalTriangle() {
        assertArrayEquals(new Exercise19().pascalTriangle(2), new int[]{1, 2, 1});
        assertArrayEquals(new Exercise19().pascalTriangle(4), new int[]{1, 4, 6, 4, 1});
        assertArrayEquals(new Exercise19().pascalTriangle(5), new int[]{1, 5, 10, 10, 5, 1});
    }
}
