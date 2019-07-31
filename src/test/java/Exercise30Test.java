import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise30Test {

    @Test
    public void test_convert() {

        assertEquals(new Exercise30().convert(150), "CL");
        assertEquals(new Exercise30().convert(2288), "MMCCLXXXVIII");
        assertEquals(new Exercise30().convert(8), "VIII");
        assertEquals(new Exercise30().convert(940), "CMXL");

        assertEquals(new Exercise30().convert(99), "XCIX");
        assertEquals(new Exercise30().convert(4), "IV");
        assertEquals(new Exercise30().convert(510), "DX");
        assertEquals(new Exercise30().convert(421), "CDXXI");

    }
}