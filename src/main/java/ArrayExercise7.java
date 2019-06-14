import java.util.ArrayList;
import java.util.List;

public class ArrayExercise7 {

    public static String longestCloneArray(int[] numbers) {

        int max = 0, current = 0, maxIndex = 0;

        List<Integer> result = new ArrayList<>();


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) {
                current++;
            } else {
                if (max < current) {
                    max = current;
                    maxIndex = i - max;
                }
                current = 0;
            }
        }

        if (max < current) {
            max = current;
            maxIndex = numbers.length - max;
        }

        for (int i = maxIndex - 1; i < max + maxIndex; i++) {
            result.add(numbers[i]);
        }

        return result.toString();
    }
}
