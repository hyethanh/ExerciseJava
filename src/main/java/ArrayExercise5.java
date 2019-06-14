public class ArrayExercise5 {

    public boolean checkPrime(int n) {

        int count = 1;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return count == 2;
    }

    public int sumPrime(int[] arr) {

        int sum = 0;

        for (int i : arr) {
            if (checkPrime(arr[i])) {
                sum += arr[i];
            }
        }


        return sum;
    }
}
