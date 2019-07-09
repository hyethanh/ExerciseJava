import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayExercise17Test {

    @Test
    public void test_spojArray() {
        assertArrayEquals(new ArrayExercise17().spojArray(3),
                new int[][]{
                        {1, 2, 3},
                        {8, 9, 4},
                        {7, 6, 5}});
        assertArrayEquals(new ArrayExercise17().spojArray(1),
                new int[][]{
                        {1}});
        assertArrayEquals(new ArrayExercise17().spojArray(5),
                new int[][]{
                        {1, 2, 3, 4, 5},
                        {16, 17, 18, 19, 6},
                        {15, 24, 25, 20, 7},
                        {14, 23, 22, 21, 8},
                        {13, 12, 11, 10, 9}});

    }
}
