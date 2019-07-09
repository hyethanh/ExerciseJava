import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExercise1 {

    public List<Integer> count(int[] arr){

        ArrayList<Integer> listOut = new ArrayList<>();

        int current = arr[0];

        int count = 1;

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == current) {
                count++;
            } else {
                if (count > 1) {
                    listOut.add(current);
                    count = 1;
                }

                current = arr[i];
            }

            if (i == arr.length - 1 && count > 1) {
                listOut.add(current);
            }
        }
        return listOut;
    }
}
