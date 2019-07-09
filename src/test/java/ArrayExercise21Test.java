import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArrayExercise21Test {

    @Test
    public void test_determinal(){

        assertEquals(new ArrayExercise21().det(
                new int[][]{
                        {76,99,85},
                        {54,25,56},
                        {33,9,73}}),-135725);

        assertEquals(new ArrayExercise21().det(
                new int[][]{
                        {-1,2,3},
                        {2,-1,4},
                        {0,-3,2}}),-36);

        assertEquals(new ArrayExercise21().det(
                new int[][]{
                        {1,9,3,4},
                        {5,6,7,9},
                        {3,10,11,12},
                        {13,2,5,3}}),1598);
    }

    @Test
    public void test_subArray(){
        assertArrayEquals(new ArrayExercise21().subArray(
                new int[][]{
                        {-1,2,3},
                        {2,-1,4},
                        {0,-3,2}},1),
                new int[][]{
                        {2, 4},
                        {0,2},
                });
        assertArrayEquals(new ArrayExercise21().subArray(
                new int[][]{
                        {1,9,3,4},
                        {5,6,7,9},
                        {3,10,11,12},
                        {13,2,5,3}},2),
                new int[][]{
                        {5,6,9},
                        {3,10,12},
                        {13,2,3}
                });
    }
}
