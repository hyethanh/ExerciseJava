import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ArrayExercise2Test {

    @Test
    public void test_sum(){
        assertEquals(new ArrayExercise2().sum(new int[]{5,3,4,1,2}),12);
        assertEquals(new ArrayExercise2().sum(new int[]{5,1,3,2,5,4}),14);
    }
}
