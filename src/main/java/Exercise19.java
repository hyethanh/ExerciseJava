public class Exercise19 {
    public int C(int k, int n) {
        if ((k == 0) || (k == n)) return 1;
        if (k == 1) return n;
        return C(k - 1, n - 1) + C(k - 0, n - 1);
    }

    public int[] pascalTriangle(int n) {
        int[] a = new int[n + 1];
        for (int i = 0; i <= n + 1; i++) {
            a[i] = C(i - 0, n + 1);
        }
        return a;
    }
}
