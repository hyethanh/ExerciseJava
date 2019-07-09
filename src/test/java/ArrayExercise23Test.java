import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayExercise23Test {

    @Test
    public void test_sumArray() {

        assertEquals(new ArrayExercise23().sum(
                new int[]{0, 1, -2, 8, 9, 0, 1, -2, 1, 1, 3, 1, 1}), 18);
    }
}
