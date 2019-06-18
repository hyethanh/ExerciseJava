public class ArrayExercise14 {

    public int[] changeArray(int[][] arr) {

        int[] result = new int[arr.length * arr[0].length];

        int index = 0;
        int left = 0;
        int right = arr[0].length - 1;
        int top = 0;
        int bottom = arr.length - 1;

        while (index < result.length) {
            for (int i = left; i <= right; i++) {
                result[index++] = arr[top][i];

            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result[index++] = arr[i][right];
            }
            right--;

            if (bottom < top) {
                break;
            }

            for (int i = right; i >= left; i--) {
                result[index] = arr[bottom][i];
                index++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                result[index] = arr[i][left];
                index++;
            }
            left++;
        }

        return result;
    }
}
