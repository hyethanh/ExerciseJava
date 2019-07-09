import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayExercise3Test {

    @Test
    public void test_sub(){
        assertEquals(new ArrayExercise3().sub(new int[]{2,3,1,4,5,6}),3);
        assertEquals(new ArrayExercise3().sub(new int[]{2}),2);
    }
}
