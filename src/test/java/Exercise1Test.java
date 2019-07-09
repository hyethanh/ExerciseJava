import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise1Test {

    @Test
    public void test_ucln() {
        assertEquals(new Exercise1().ucln(10, 8), 2);

    }

    @Test
    public void test_bcnn() {
        assertEquals(new Exercise1().bcnn(10, 8), 40);
    }

    @Test
    public void test_ucbc() {
        assertEquals(new Exercise1().ucln(0, 3), 3);
        assertEquals(new Exercise1().bcnn(0, 3), 0);

        assertEquals(new Exercise1().ucln(2,0),2);
        assertEquals(new Exercise1().bcnn(2,0),0);
    }
}
