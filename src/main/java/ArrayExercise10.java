import java.util.ArrayList;
import java.util.List;

public class ArrayExercise10 {

    public String divideArray(int[] arr, int n) {

        int lengthClone = 0;

        if (arr.length % n == 0) {
            lengthClone = arr.length / n;
        } else {
            lengthClone = arr.length / n + 1;
        }
        List<List<Integer>> clone = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            temp.add(arr[i]);

            if (temp.size() == lengthClone) {
                clone.add(temp);
                temp = new ArrayList<>();
            }

        }

        if (arr.length % n != 0) {
            clone.add(temp);
        }

        return clone.toString();
    }
}
