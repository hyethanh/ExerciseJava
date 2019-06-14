import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayExercise4Test {

    @Test
    public void test_arrangeArray() {
        assertArrayEquals(new ArrayExercise4().arangeArray(
                new int[]{1, 4, 3, 2, 5, 9, 0, 6}),
                new int[]{6, 4, 2, 0, 1, 3, 5, 9});

        assertArrayEquals(new ArrayExercise4().arangeArray(
                new int[]{1, 5, 7, 1, 2, 4, 6}),
                new int[]{6, 4, 2, 1, 1, 5, 7});

        assertArrayEquals(new ArrayExercise4().arangeArray(
                new int[]{8, 6, 4, 2, 9, 1, 5, 3}),
                new int[]{8, 6, 4, 2, 1, 3, 5, 9});
    }
}
