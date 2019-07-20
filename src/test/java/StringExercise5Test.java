import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class StringExercise5Test {

    @Test
    public void wordTest(){

        assertArrayEquals(new StringExercise5()
                .findDuplicatedWords("hello world hello again hello again"),
                new String[]{"hello", "again"});
    }
}
