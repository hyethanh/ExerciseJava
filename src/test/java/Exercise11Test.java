import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise11Test {

    @Test
    public void test_interset(){
        assertEquals(new Exercise11().interest(100,2),225,0.001);
        assertEquals(new Exercise11().interest(100,1),200,0.01);
    }
}
