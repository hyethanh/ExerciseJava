public class Exercise24 {

    public int countFibNumber(int n) {

        int count = 1;
        int a = 0, b = 1;
        int c;

        for (int i = 1; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            if (c <= n) {
                count++;
            }
        }
        return count;
    }
}
