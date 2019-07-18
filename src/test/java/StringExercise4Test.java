import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringExercise4Test {

    @Test
    public void sumNumberTest(){

        assertEquals(new StringExercise4().sumNumber("abc 123 def 33 mn 3.221"),380);
    }
}
