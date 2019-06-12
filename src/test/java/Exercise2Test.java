import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise2Test {

    @Test
     public void test_sum(){
        assertEquals(new Exercise2().sum(123), 6);
        assertEquals(new Exercise2().sum(10),1);
        assertEquals(new Exercise2().sum(2345),14);
    }
}
