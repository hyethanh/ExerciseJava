import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise16Test {

    @Test
    public void test_Triangle() {

        assertEquals(new Exercise16().Triangle(0, 2, 1, 6, 4, 2), "La 3 canh tam giac thuong co chu vi 13.12, dien tich 8.0");
        assertEquals(new Exercise16().Triangle(-1, 1, 1, 3, 2, 0), "La 3 canh tam giac can co chu vi 9.15, dien tich 4.0");
        assertEquals(new Exercise16().Triangle(0, 0, 0, 3, 4, 0), "La 3 canh cua tam giac vuong co chu vi 12.0, dien tich 6.0");
        assertEquals(new Exercise16().Triangle(0, 0, 0, 3, 0, 4), "Khong phai la ba canh cua tam giac");
        assertEquals(new Exercise16().Triangle(0,0,2.5,Math.sqrt(29.75),5,0),"La 3 canh tam giac can co chu vi 17.0, dien tich 13.64");

    }
}
