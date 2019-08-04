package OOPExerciseTest;

import OOPExercise1.Triangle;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void Triangle_test() {

        assertTrue(new Triangle().is_Triangle(0, 2, 1, 6, 4, 2));
        assertTrue(new Triangle().is_Triangle(4, 2, 3, 6, 7, -1));
        assertTrue(new Triangle().is_Triangle(0, 0, 0, 3, 6, 0));
        assertTrue(new Triangle().is_Triangle(0, 2, 0, 8, 8, 2));

        assertFalse(new Triangle().is_Triangle(0, 0, 0, 3, 0, 4));
        assertFalse(new Triangle().is_Triangle(0, 0, 0, 0, 0, 0));
        assertFalse(new Triangle().is_Triangle(-1, 0, 0, 0, 4, 0));

    }

    @Test
    public void edgeTriangle_test() {

        assertEquals(new Triangle().edgeTriangle(0, 3, 4, 0), 5.0, 0.00);
        assertEquals(new Triangle().edgeTriangle(0, 2, 1, 6), 4.123, 0.001);

    }

    @Test
    public void getType_test() {

        assertEquals(new Triangle(0, 0, 0, 3, 4, 0).getType(), "Tam giac vuong");
        assertEquals(new Triangle(0, 0, 3, 4, 6, 0).getType(), "Tam giac can");
        assertEquals(new Triangle(0, 2, 1, 6, 4, 2).getType(), "Tam giac thuong");
        assertEquals(new Triangle(0, 0, 2.5, Math.sqrt(29.75), 5, 0).getType(), "Tam giac can");
        assertEquals(new Triangle(-1, 0, 1, 0, 0, Math.sqrt(3)).getType(), "Tam giac can");
    }

    @Test
    public void getPerimeter_test() {

        assertEquals(new Triangle(0, 2, 1, 6, 4, 2).getPerimeter(), 13.12, 0.01);
        assertEquals(new Triangle(0, 0, 3, 4, 6, 0).getPerimeter(), 16.00, 0.01);
        assertEquals(new Triangle(0, 0, 0, 3, 4, 0).getPerimeter(), 12.0, 0.01);
        assertEquals(new Triangle(0, 0, 2.5, Math.sqrt(29.75), 5, 0).getPerimeter(), 17.0, 0.1);

    }

    @Test
    public void getArea_test() {

        assertEquals(new Triangle(0, 2, 1, 6, 4, 2).getArea(), 8.00, 0.01);
        assertEquals(new Triangle(0, 0, 3, 4, 6, 0).getArea(), 12.00, 0.01);
        assertEquals(new Triangle(0, 0, 0, 3, 4, 0).getArea(), 6.00, 0.01);
        assertEquals(new Triangle(0, 0, 2.5, Math.sqrt(29.75), 5, 0).getArea(), 13.64, 0.01);

    }
}
