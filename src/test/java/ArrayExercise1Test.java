import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class ArrayExercise1Test {

    @Test
    public void test_array(){
        assertEquals(new ArrayExercise1().count(new int[]{1,2,3,4,2,2,5}),Arrays.asList(2));
        assertEquals(new ArrayExercise1().count(new int[]{3,4,4,1,2,3}),Arrays.asList(3,4));
           }
}
