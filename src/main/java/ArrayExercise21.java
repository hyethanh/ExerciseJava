public class ArrayExercise21 {

    public int[][] subArray(int[][] arr, int col) {

        int[][] result = new int[arr.length - 1][arr[0].length - 1];

        for (int r = 1; r < arr.length; r++) {
            int c = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (j == col) {
                    continue;
                }

                result[r - 1][c] = arr[r][j];
                c++;
            }
        }

        return result;
    }

    public int det(int[][] arr) {

        int det = 0;
        int m = 0, n = 0;
        int k = arr.length;
        if (arr.length == 1) {
            return arr[0][0];
        }

        for (int i = 0; i < k; i++) {
            if (i % 2 == 0) {
                det += arr[m][i] * det(subArray(arr, i));
            } else {
                det -= arr[m][i] * det(subArray(arr, i));
            }
        }


        return det;
    }
}
