import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise3Test {

    @Test
    public void test_mullPrime(){
        assertEquals(new Exercise3().mullPrime(100),2*2*5*5);
        assertEquals(new Exercise3().mullPrime(600),2 * 2 * 2 * 3 * 5 * 5);
        assertEquals(new Exercise3().mullPrime(3),3);
    }
}
