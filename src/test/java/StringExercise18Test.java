import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringExercise18Test {

    @Test
    public void multiplyString_test(){

        assertEquals(new StringExercise18().multiplyString("13","18"),"234");
        assertEquals(new StringExercise18().multiplyString("456","18"),"8208");
        assertEquals(new StringExercise18().multiplyString("456","108"),"49248");
        assertEquals(new StringExercise18().multiplyString("4560","1080"),"4924800");
    }

    @Test
    public void mulString_test(){

        assertEquals(new StringExercise18().multiplyString("12",2),"24");
        assertEquals(new StringExercise18().multiplyString("123",4),"492");
        assertEquals(new StringExercise18().multiplyString("456",8),"3648");
        assertEquals(new StringExercise18().multiplyString("3",8),"24");
        assertEquals(new StringExercise18().multiplyString("10",8),"80");
    }
}
