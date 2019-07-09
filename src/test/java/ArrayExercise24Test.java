import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayExercise24Test {

    @Test
    public void test_leastCommonMultiple(){

        assertEquals(new ArrayExercise24().leastCommonMultiple(8,9),72);
        assertEquals(new ArrayExercise24().leastCommonMultiple(3,0),0);
    }

    public void test_greastCommonMultiple(){

        assertEquals(new ArrayExercise24().greastCommonDivisor(8,2),4);
        assertEquals(new ArrayExercise24().greastCommonDivisor(0,2),2);
    }

    @Test
    public void test_leastCommonMultipleArray(){

        assertEquals(new ArrayExercise24().leastCommonMultipleArray(
                new int[]{0,1,2,8,9,3}),0);

        assertEquals(new ArrayExercise24().leastCommonMultipleArray(
                new int[]{4,1,2,8,12,3}),24);
    }

}
