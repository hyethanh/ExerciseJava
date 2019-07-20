import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringExercise9Test {

    @Test
    public void abridgeString_test(){

        assertEquals(new StringExercise9().abridgeString("abcccceeeeeefd"),"abc4e6fd");
    }
}
