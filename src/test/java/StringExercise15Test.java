import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringExercise15Test {

    @Test
    public void findVerifyumber_test(){

        assertEquals(new StringExercise15().findVerifyNumber("893603820056"),8);
        assertEquals(new StringExercise15().findVerifyNumber("893850597419"),4);
    }
}
