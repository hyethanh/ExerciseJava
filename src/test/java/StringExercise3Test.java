import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringExercise3Test {

    @Test
    public void symmetricTest(){

        assertEquals(new StringExercise3().symmetric("abcdcba"),"Chuoi doi xung");
        assertEquals(new StringExercise3().symmetric("abccba"),"Chuoi doi xung");
        assertEquals(new StringExercise3().symmetric("abcdef"),"Chuoi khong doi xung");
    }
}
