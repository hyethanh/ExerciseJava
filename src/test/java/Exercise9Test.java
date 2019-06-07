import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise9Test {

    @Test
    public void test_so_pi(){
        assertEquals(new Exercise9().PI(),3.1413,0.0001);
    }
}
