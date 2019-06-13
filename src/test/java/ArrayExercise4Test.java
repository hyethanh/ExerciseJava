import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArrayExercise4Test {

    @Test
    public void test_arrangeArray() {
        assertArrayEquals(new ArrayExercise4().arangeArray(new Integer[]{1, 4, 3, 2, 5, 9, 0, 6}), new Integer[]{6, 4, 2, 0, 1, 3, 5, 9});
        assertArrayEquals(new ArrayExercise4().arangeArray(new Integer[]{1, 5, 7, 1, 2, 4, 6}), new Integer[]{6, 4, 2, 1, 1, 5, 7});
    }
}
