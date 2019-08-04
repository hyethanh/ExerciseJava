import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringExercise18Test {

    @Test
    public void multiplyString_test() {

        assertEquals(new StringExercise18().multiplyString("13", "18"), "234");
        assertEquals(new StringExercise18().multiplyString("456", "18"), "8208");
        assertEquals(new StringExercise18().multiplyString("456", "108"), "49248");
        assertEquals(new StringExercise18().multiplyString("4560", "1080"), "4924800");
    }

    @Test
    public void addString_test() {

        assertEquals(new StringExercise18().addString("12", "13"), "25");
        assertEquals(new StringExercise18().addString("0", "4321"), "4321");
        assertEquals(new StringExercise18().addString("3", "8"), "11");
        assertEquals(new StringExercise18().addString("13", "8"), "21");
        assertEquals(new StringExercise18().addString("98989183193618468264826482648", "2878264184917491649264824825437"),
                "2977253368111110117529651308085");

    }

    @Test
    public void mulString_test() {

        assertEquals(new StringExercise18().multiplyString("12", 2), "24");
        assertEquals(new StringExercise18().multiplyString("123", 4), "492");
        assertEquals(new StringExercise18().multiplyString("456", 8), "3648");
        assertEquals(new StringExercise18().multiplyString("3", 8), "24");
        assertEquals(new StringExercise18().multiplyString("10", 8), "80");
    }



}
