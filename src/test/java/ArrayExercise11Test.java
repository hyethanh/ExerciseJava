import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayExercise11Test {

    @Test
    public void test_changeArray() {
        assertArrayEquals(new ArrayExercise11().changeNumber(
                new int[]{1, 2, 4, 5, 6, 7, 8, 10}),
                new int[]{7, 10, 8, 5, 6, 1, 4, 2});
    }
}
