public class ArrayExercise4 {

    public int[] arangeArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] % 2 == 0 && arr[j] % 2 == 1) {
                    continue;
                }
                if (arr[i] % 2 == arr[j] % 2) {
                    if ((arr[i] > arr[j]) == (arr[i] % 2 == 0)) {
                        continue;
                    }
                }

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        return arr;
    }
}

