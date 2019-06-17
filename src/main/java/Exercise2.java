public class Exercise2 {

    public int sum(int n){
        int k;
        int sum = 0;
        while(n>0) {
            k = n%10;
            n = n/10;
            sum += k;
        }
        return sum;
    }
}
