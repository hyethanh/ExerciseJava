import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayExercise4 {

    public Integer[] arangeArray(Integer[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] % 2 == 1 && arr[j] % 2 == 0) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

            if (arr[i] % 2 == 0) {
                Arrays.sort(arr, 0, i + 1, Collections.reverseOrder());
            } else {
                Arrays.sort(arr, i, arr.length);
            }

        }

        return arr;
    }
}

