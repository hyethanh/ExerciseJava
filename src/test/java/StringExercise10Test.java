import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringExercise10Test {

    @Test
    public void extendString_test(){

        assertEquals(new StringExercise10().extendString("abc4e6fd"),"abcccceeeeeefd");
        assertEquals(new StringExercise10().extendString("a10b12c"),"aaaaaaaaaabbbbbbbbbbbbc");
        assertEquals(new StringExercise10().extendString("a10b12"),"aaaaaaaaaabbbbbbbbbbbb");
    }
}
