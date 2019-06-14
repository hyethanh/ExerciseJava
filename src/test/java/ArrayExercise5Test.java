import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayExercise5Test {

    @Test
    public void test_Prime() {

        assertTrue(new ArrayExercise5().checkPrime(2));
        assertFalse(new ArrayExercise5().checkPrime(8));
        assertFalse(new ArrayExercise5().checkPrime(0));
        assertFalse(new ArrayExercise5().checkPrime(0));
        assertTrue(new ArrayExercise5().checkPrime(13));
    }

    @Test
    public void test_sumPrime() {
        assertEquals(new ArrayExercise5().sumPrime(new int[]{6, 7, 8, 1, 2, 0, 8, 4}), 9);
    }
}
