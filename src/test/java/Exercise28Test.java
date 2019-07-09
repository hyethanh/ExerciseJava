import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise28Test {

    @Test
    public void test_squareRoot() {
        assertEquals(new Exercise28().squareRoot(2.0), 1.41421, 0.0001);
        assertEquals(new Exercise28().squareRoot(16.0), 4.0, 0.0001);
    }
}
