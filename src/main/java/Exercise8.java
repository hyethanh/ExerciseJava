public class Exercise8 {
    public int factorial(int n){
        int p = 1;
        if(n==0||n==1)
            return p;
        else {
            for (int i = 2; i <= n; i++) {
                p = p * i;
            }
        }
        return p;
    }
}
