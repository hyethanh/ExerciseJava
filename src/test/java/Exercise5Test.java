import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise5Test {

    @Test
    public void test_Fibonacci(){
        assertEquals(new Exercise5().Fibonacci(22),"1 1 2 3 5 8 13 21");
        assertEquals(new Exercise5().Fibonacci(9),"1 1 2 3 5 8");
    }
}
