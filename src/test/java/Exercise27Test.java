import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise27Test {
    @Test
    public void test_count(){
       assertEquals(new Exercise27().countZero(10),2);
       assertEquals(new Exercise27().countZero(3),0);
       assertEquals(new Exercise27().countZero(151),37);
       assertEquals(new Exercise27().countZero(0),0);
    }
}
