public class Exercise5 {
    public String Fibonacci(int n) {

        int a = 0;
        int b = 1;
        int c = 1;

        StringBuilder result = new StringBuilder();

        while (c <= n){
            result.append(c).append(" ");

            c = a + b;
            a = b;
            b = c;
        }

        return result.toString().trim();
    }
}
