import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringExercise18Test {

    @Test
    public void multiplyString_test(){

        //assertEquals(new StringExercise18().multiplyString("3","8"),"24");
        //assertEquals(new StringExercise18().multiplyString("10","8"),"80");
        assertEquals(new StringExercise18().multiplyString("18","3"),"54");
        assertEquals(new StringExercise18().multiplyString("18","13"),"234");
    }
}
