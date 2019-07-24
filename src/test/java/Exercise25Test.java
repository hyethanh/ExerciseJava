import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise25Test {

    @Test
    public void test_countNumber() {

        assertEquals(new Exercise25().countNumber(0, 4), 4);
        assertEquals(new Exercise25().countNumber(0, 1), 2);
        assertEquals(new Exercise25().countNumber(0, 21), 8);

    }
}
