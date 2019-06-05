import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise1Test {

    @Test
    public void test_ucln() {
            assertEquals(new Exercise1().ucln(10, 8), 2);

    }
@Test
    public void test_bcnn() {
        assertEquals(new Exercise1().bcnn(10,8),40);
    }
}
