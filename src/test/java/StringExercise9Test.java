import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringExercise9Test {

    @Test
    public void abridgeString_test() {

        assertEquals(new StringExercise9().abridgeString("abcccceeeeeefd"), "abc4e6fd");
        assertEquals(new StringExercise9().abridgeString("abbbbbbbbbbbbbc"), "ab13c");
        assertEquals(new StringExercise9().abridgeString("abbbbbbbbbbbbbcc"), "ab13c2");

    }
}
