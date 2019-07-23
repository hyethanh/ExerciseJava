import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringExercise9Test {

    @Test
    public void abridgeString_test() {

        assertEquals(new StringExercise9().abridgeString("abcccceeeeeefd"), "abc4e6fd");
        assertEquals(new StringExercise9().abridgeString("abbbbbbbbbbbbbc"), "ab13c");
<<<<<<< HEAD
        assertEquals(new StringExercise9().abridgeString("cc"), "c2");
=======
        assertEquals(new StringExercise9().abridgeString("abbbbbbbbbbbbbcc"), "ab13c2");
>>>>>>> 297dad69774370779687103cf1b6e3c0cd326df7

    }
}
