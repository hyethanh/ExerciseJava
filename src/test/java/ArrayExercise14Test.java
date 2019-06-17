import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayExercise14Test {

    @Test
    public void test_changeArray() {

        assertArrayEquals(new ArrayExercise14().changeArray(
                new int[][]{
                        {1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11, 12, 13, 14, 15}}),
                new int[]
                        {1, 2, 3, 4, 5, 10, 9, 8, 7, 6, 11, 12, 13, 14, 15});

        assertArrayEquals(new ArrayExercise14().changeArray(
                new int[][]{
                        {1, 2, 3, 4}}),
                new int[]
                        {1, 2, 3, 4});

        assertArrayEquals(new ArrayExercise14().changeArray(
                new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8}}),
                new int[]
                        {1, 2, 3, 4, 8, 7, 6, 5});


    }
}
