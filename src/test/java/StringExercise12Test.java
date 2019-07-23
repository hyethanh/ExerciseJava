import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringExercise12Test {

    @Test
    public void deleteDuplicateLetter(){

        assertEquals(new StringExercise12().deleteDuplicateLetter("abbbbbbccccd eeffffddbc"),"abcd efdbc");

    }
}
