public class Exercise5 {
    public String Fibonacci(int n) {
        int c=0;
        int a = 1, b = 1;
        String result = "1 1";

        while(c<n)
        {
            c = a + b;
            result += " "+c;
            a = b;
            b = c;
        }
        result = result.substring(0,result.length()-3);
        return result;
    }
}
