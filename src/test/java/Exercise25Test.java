import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise25Test {

    @Test
    public void test_countNumber() {

        assertEquals(new Exercise25().countNumber(0, 4), 4);
        assertEquals(new Exercise25().countNumber(0, 1), 2);
        assertEquals(new Exercise25().countNumber(0, 21), 8);
        assertEquals(new Exercise25().countNumber(10, 30), 2);

        assertEquals(new Exercise25().countNumber(10, 196418	), 21);
        assertEquals(new Exercise25().countNumber(13, 196418	), 21);
        assertEquals(new Exercise25().countNumber(14, 196418	), 20);
        assertEquals(new Exercise25().countNumber(10, 196417	), 20);

    }
}
