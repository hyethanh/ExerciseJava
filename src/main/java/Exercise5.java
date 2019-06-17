public class Exercise5 {
    public String Fibonacci(int n) {

        int c = 0;
        int a = 1, b = 1;
        String result = "1 1";

        do {
            c = a + b;
            result += " " + c;
            a = b;
            b = c;
        } while (a + b <= n);

        return result;
    }
}
