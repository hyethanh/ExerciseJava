public class ArrayExercise23 {

    public int sum(int[] arr) {

        int sum = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
            if (arr[i] < 0) {
                sum = 0;
            }
        }

        return max;
    }
}
