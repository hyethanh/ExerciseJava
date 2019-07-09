public class Exercise8 {

    public int factorial(int n) {

        int p = 1;

        for (int i = 2; i <= n; i++) {
            p = p * i;
        }

        return p;
    }
}
