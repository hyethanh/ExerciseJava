public class Exercise20 {
    public int sumFib(int n) {
        int c;
        int a = 1, b = 1;
        int sum = 2;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            sum += c;
            a = b;
            b = c;
        }
        return sum;
    }

}
