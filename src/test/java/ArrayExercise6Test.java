import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayExercise6Test {

    @Test
    public void test_arrangeArray() {

        assertArrayEquals(new ArrayExercise6().arrangeArray(
                new int[]{2, 4, 3, 1, 6, 8, 5, 9}),
                new int[]{2, 4, 3, 1, 6, 8, 9, 5});
    }
}
