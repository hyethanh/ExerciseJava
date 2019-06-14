import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayExercise8Test {

    @Test
    public void test_subMinMax() {
        assertEquals(new ArrayExercise8().subMinMax(new int[]{1, 4, 2, 7, 8, 3}), 7);
        assertEquals(new ArrayExercise8().subMinMax(new int[]{4, 6, 2, 11, 6, 0, -3}), 14);
    }
}
