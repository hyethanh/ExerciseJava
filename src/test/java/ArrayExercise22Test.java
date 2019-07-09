import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayExercise22Test {

    @Test

    public void test_cloneArray() {

        assertArrayEquals(new ArrayExercise22().cloneArray(
                new int[][]{
                        {1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 1},
                        {3, 4, 5, 6, 7}}, 4, 2),
                new int[][]{
                        {1, 2, 3, 4},
                        {6, 7, 8, 9}
                });

        assertArrayEquals(new ArrayExercise22().cloneArray(
                new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}}, 2, 3),
                new int[][]{
                        {1, 2, 4},
                        {5, 6, 8},
                        {9, 10, 12},
                });
    }
}
