public class ArrayExercise8 {

    public int subMinMax(int[] arr) {

        int max = arr[0];
        int min = arr[0];

        for (int i : arr) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return (max - min);
    }
}
