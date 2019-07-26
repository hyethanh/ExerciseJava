import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringExercise17Test {

    @Test
    public void getNumberic_test() {

        assertEquals(new StringExercise17().getNumberic("12", 0), 2);
        assertEquals(new StringExercise17().getNumberic("12", 1), 1);
        assertEquals(new StringExercise17().getNumberic("12", 2), 0);
    }

    @Test
    public void subtractString_test() {

        assertEquals(new StringExercise17().subtractString("25", "13"), "12");
        assertEquals(new StringExercise17().subtractString("25", "8"), "17");
        assertEquals(new StringExercise17().subtractString("8", "25"), "-17");
        assertEquals(new StringExercise17().subtractString("18", "25"), "-7");

        assertEquals(new StringExercise17().subtractString("208", "109"), "99");
        assertEquals(new StringExercise17().subtractString("2384", "489"), "1895");
        assertEquals(new StringExercise17().subtractString("67158762162384947262839", "8272611830489939012342"),
                "58886150331895008250497");

    }
}
