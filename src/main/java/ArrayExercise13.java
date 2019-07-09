public class ArrayExercise13 {

    public int[][] rotateArray(int[][] source) {

        int rows = source.length;
        int cols = source[0].length;

        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][rows - 1 - i] = source[i][j];
            }
        }

        return result;
    }
}

