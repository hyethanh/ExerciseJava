import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringExercise16Test {

    @Test
    public void addString_test() {

        assertEquals(new StringExercise16().addString("12", "13"), "25");
        assertEquals(new StringExercise16().addString("0", "4321"), "4321");
        assertEquals(new StringExercise16().addString("3", "8"), "11");
        assertEquals(new StringExercise16().addString("13", "8"), "21");
        assertEquals(new StringExercise16().addString("98989183193618468264826482648", "2878264184917491649264824825437"),
                "2977253368111110117529651308085");

    }

    @Test
    public void test_getNumberic() {
        assertEquals(new StringExercise16().getNumberic("12", 0), 2);
        assertEquals(new StringExercise16().getNumberic("12", 1), 1);
        assertEquals(new StringExercise16().getNumberic("12", 2), 0);
    }

    @Test
    public void addString() {
    }
}
