public class StringExercise15 {

    public int findVerifyNumber(String str) {

        int x;
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            if (i % 2 == 0) {
                sum += str.charAt(i) - '0';

            } else {
                sum += 3 * (str.charAt(i) - '0');

            }
        }

        int temp = sum;

        while (temp % 10 != 0) {

            temp++;

        }

        x = temp - sum;

        return x;
    }
}
