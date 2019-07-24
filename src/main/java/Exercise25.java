public class Exercise25 {

    public int countNumber(int m, int n) {

        int a = 0;
        int b = 1;
        int count = 0;
        if (a >= m) {

            while (b <= n) {

                int c = a + b;
                a = b;
                b = c;

                count++;
            }
        }

        return count;
    }
}
