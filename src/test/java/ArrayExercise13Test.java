import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayExercise13Test {

    @Test
    public void test_turnArray() {

        assertArrayEquals(new ArrayExercise13().rotateArray(
                new int[][]{
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }),
                new int[][]{
                        {7, 4, 1},
                        {8, 5, 2},
                        {9, 6, 3}
                });

        assertArrayEquals(new ArrayExercise13().rotateArray(
                new int[][]{
                        {6, 8, 9},
                        {2, 1, 3}}),
                new int[][]{
                        {2, 6},
                        {1, 8},
                        {3, 9}});

        assertArrayEquals(new ArrayExercise13().rotateArray(
                new int[][]{{1,2,3}}),
                new int[][]{
                        {1},
                        {2},
                        {3}});

        assertArrayEquals(new ArrayExercise13().rotateArray(
                new int[][]{
                        {4},
                        {3},
                        {2},
                        {1}}),
                new int[][]{{1,2,3,4}});
    }

}
