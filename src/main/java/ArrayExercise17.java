public class ArrayExercise17 {

    public int[][] spojArray(int n) {

        int[][] arr = new int[n][n];

        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int count = 1;

        while (count <= n * n) {
            for (int i = left; i <= right; i++) {
                arr[left][i] = count++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = count++;

            }
            right--;

            for (int i = right; i >= left; i--) {
                arr[bottom][i] = count++;

            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                arr[i][left] = count++;

            }
            left++;
        }
        return arr;
    }
}
