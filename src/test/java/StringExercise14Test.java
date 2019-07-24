import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringExercise14Test {

    @Test
    public void testValidityBarcode_test() {

        assertEquals(new StringExercise14().testValidityBarcode("8938505974194"), "Barcode hop le");
        assertEquals(new StringExercise14().testValidityBarcode("8938505974195"), "Barcode khong hop le");
    }
}
