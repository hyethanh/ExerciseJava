import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayExercise9Test {

    @Test
    public void test_positionNumber() {
        assertEquals(new ArrayExercise9().positionNumber(new int[]{1, 2, 4, 5, 8, 10, 75}, 4), 2);
        assertEquals(new ArrayExercise9().positionNumber(new int[]{0, 3, 4, 6, 7, 9, 12, 16, 17}, 18), -1);
        assertEquals(new ArrayExercise9().positionNumber(new int[]{0, 3, 4, 6, 7, 9, 12, 16, 17}, 12), 6);
    }
}
