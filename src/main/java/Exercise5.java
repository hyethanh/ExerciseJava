public class Exercise5 {
    public String Fibonacci(int n) {
        int c;
        int a = 1, b = 1;
        String result = "1 1 ";

        for (int i = 3; i <= n; i++) {
            c = a + b;
            result += c+" ";
            a = b;
            b = c;
        }
        result = result.substring(0);
        return result;
    }
}
