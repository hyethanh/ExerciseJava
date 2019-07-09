import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise29Test {

    @Test
    public void test_changeRomanNumer() {
        assertEquals(new Exercise29().changeRomanNumber("X"), 10);
        assertEquals(new Exercise29().changeRomanNumber("VI"), 6);
        assertEquals(new Exercise29().changeRomanNumber("MMCCLXXXVIII"),2288);
    }
}
