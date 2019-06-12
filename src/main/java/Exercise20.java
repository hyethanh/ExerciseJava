public class Exercise20{
    public int sum_Fib(int n){
        int c;
        int a=1,b=1;
        int sum = 0;
        for(int i=2;i<=n;i++) {
            c = a + b;
            sum += c;
            a = b;
            b = c;
        }
        return sum;
    }

}
