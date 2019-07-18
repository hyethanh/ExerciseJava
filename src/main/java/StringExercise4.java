public class StringExercise4 {

    public int sumNumber(String s) {

        char[] str = s.toCharArray();
        int sum = 0;
        int j, n, i = 0;
        while (i < s.length()) {
            if (Character.isDigit(str[i])) {
                j = i;
                n = 0;
                while (j < s.length() && Character.isDigit(str[j])) {
                    n = 10 * n + (int) str[j] - 48;
                    j++;
                }

                sum += n;
                i = j;
            } else i++;
        }
        return sum;
    }
}
