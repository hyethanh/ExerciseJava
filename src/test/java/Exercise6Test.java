import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise6Test {

    @Test
    public void test_equation_2nd(){
        assertEquals(new Exercise6().equation_2nd(1,2,1),"Phuong trinh co nghiem kep: x1 = x2 = -1.0");
        assertEquals(new Exercise6().equation_2nd(0,2,5),"Nghiem phuong trinh x = -2.5");
        assertEquals(new Exercise6().equation_2nd(0,0,0),"Phuong trinh vo so nghiem");
        assertEquals(new Exercise6().equation_2nd(1,-5,6),"Phuong trinh co 2 nghiem phan biet: x1= 3.0, x2= 2.0");

    }
}
