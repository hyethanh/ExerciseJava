public class ArrayExercise14 {

    public int[] changeArray(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;
        int index = 0;
        int size = cols * rows;
        int[] result = new int[size];

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    result[index] = arr[i][j];
                    index++;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    result[index] = arr[i][j];
                    index++;
                }

            }
        }

        return result;
    }
}
