import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayExercise7Test {

    @Test
    public void test_longestCloneArray(){
        assertEquals(new ArrayExercise7().longestCloneArray(new int[]{2,4,6,1,7,5}),"[2, 4, 6]");
        assertEquals(new ArrayExercise7().longestCloneArray(new int[]{2,4,6,1,7,9,11,10}),"[1, 7, 9, 11]");
    }
}
