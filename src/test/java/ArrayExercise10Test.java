import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayExercise10Test {

    @Test
    public void test_divideCloneArray() {
        assertEquals(new ArrayExercise10().divideArray(
                new int[]{1, 3, 2, 5, 6, 7, 4, 0}, 3),
                "[[1, 3, 2], [5, 6, 7], [4, 0]]");

        assertEquals(new ArrayExercise10().divideArray(
                new int[]{1, 3, 2, 5, 6, 7, 4, 0}, 2),
                "[[1, 3, 2, 5], [6, 7, 4, 0]]");

    }
}
