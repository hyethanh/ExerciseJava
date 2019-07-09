import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Excise15Test {
    @Test
    public void test_triangle(){
        assertEquals(new Exercise15().Triangle(1,1,2),"Khong phai la ba canh cua tam giac");
        assertEquals(new Exercise15().Triangle(3,4,5),"La 3 canh cua tam giac vuong co chu vi 12.0, dien tich 6.0");
        assertEquals(new Exercise15().Triangle(3,3,3),"La 3 canh tam giac deu co chu vi 9.0, dien tich 3.897114317029974");
        assertEquals(new Exercise15().Triangle(5,5,8),"La 3 canh tam giac can co chu vi 18.0, dien tich 12.0");
    }
}
