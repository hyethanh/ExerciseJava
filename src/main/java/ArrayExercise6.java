public class ArrayExercise6 {

    public int[] arrangeArray(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] % 2 == 0 && arr[j] % 2 == 0) {
                    if (arr[i] < arr[j]) {
                        continue;
                    }
                }
                if (arr[i] % 2 == 1 && arr[j] % 2 == 1) {
                    if (arr[i] > arr[j]) {
                        continue;
                    }
                }
                if (arr[i] % 2 != arr[j] % 2) {
                    break;
                }

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        return arr;
    }

}
