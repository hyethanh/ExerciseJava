public class ArrayExercise25 {

    public int greatestCommonDivisor(int a, int b) {

        if (a == 0 || b == 0)
            return (a + b);

        else {
            while (a != b) {
                if (a > b)
                    a -= b;
                else
                    b -= a;
            }
        }

        return a;
    }

    public int greatestCommonDivisorArray(int[] arr) {

        int temp = greatestCommonDivisor(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            temp = greatestCommonDivisor(temp, arr[i]);
        }

        return temp;
    }

}
