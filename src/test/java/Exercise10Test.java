import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise10Test {

    @Test
    public void test_pi(){
        assertEquals(new Exercise10().PI(), 3.14159265358,0.00001);
    }
}
