import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringExercise8Test {

    @Test
    public void standardize_test(){

        assertEquals(new StringExercise8().standardize("ha noi la thu do, Viet.Nam"),"Ha noi la thu do, viet. Nam");
}
}
