import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise12Test {

    @Test
    public void test_expression(){
        assertEquals(new Exercise12().expression(0),1.000,0.001);
        assertEquals(new Exercise12().expression(3),2.667,0.001);
    }
}
