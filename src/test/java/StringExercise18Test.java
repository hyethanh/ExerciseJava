import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringExercise18Test {

    @Test
    public void multiplyString(){

        assertEquals(new StringExercise18().multiplyString("3","8"),"24");
        assertEquals(new StringExercise18().multiplyString("10","8"),"80");
        assertEquals(new StringExercise18().multiplyString("13","8"),"104");
    }
}
