import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise20Test {
    @Test
    public void test_sumFib(){

        assertEquals(new Exercise20().sum_Fib(2),2);
        assertEquals(new Exercise20().sum_Fib(6),20);
        assertEquals(new Exercise20().sum_Fib(5),12);
    }
}
