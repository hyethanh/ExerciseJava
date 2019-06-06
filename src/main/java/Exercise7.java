public class Exercise7 {
    public int sum_mul(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
           sum = sum + i*(i+1);
        }
        return sum;
    }
}
