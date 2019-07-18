import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringExercise6Test {

    @Test
    public void upDownCaseString_test(){

        assertEquals(new StringExercise6().upDownCaseString("abCDEfgh"),"ABcdeFGH");

    }
}
