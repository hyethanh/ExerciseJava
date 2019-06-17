import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArrayExercise12Test {

    @Test
    public void test_insertArray(){
        assertArrayEquals(new ArrayExercise12().insertArray(
                new int[]{1,2,3,5,6},4),
                new int[]{1,2,3,4,5,6});

        assertArrayEquals(new ArrayExercise12().insertArray(
                new int[]{1,2,3,5,6},5),
                new int[]{1,2,3,5,5,6});
    }
}
