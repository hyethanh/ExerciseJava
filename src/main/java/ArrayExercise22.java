public class ArrayExercise22 {

    public int[][] cloneArray(int[][] arr, int x, int y) {

        int[][] result = new int[arr.length - 1][arr[0].length - 1];

        int m = 0;

        for (int i = 0; i < arr.length; i++) {
            int n = 0;
            if (i == y) {
                continue;
            }

            for (int j = 0; j < arr[0].length; j++) {
                if (j == x) {
                    continue;
                }
                result[m][n] = arr[i][j];
                n++;
            }
            m++;
        }

        return result;
    }
}
