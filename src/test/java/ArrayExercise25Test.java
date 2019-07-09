import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayExercise25Test {

    @Test
    public void test_greatestCommonDivisor() {

        assertEquals(new ArrayExercise25().greatestCommonDivisor(4, 8), 4);
        assertEquals(new ArrayExercise25().greatestCommonDivisor(0, 5), 5);

    }

    @Test
    public void test_greatestCommonDivisorArray() {

        assertEquals(new ArrayExercise25().greatestCommonDivisorArray(
                new int[]{6, 9, 18, 3, 27}), 3);

        assertEquals(new ArrayExercise25().greatestCommonDivisorArray(
                new int[]{6, 24, 4, 8, 0, 10, 2}), 2);
    }
}
