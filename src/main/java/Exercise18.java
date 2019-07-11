public class Exercise18 {
    public int number(int n){
        int m=0;
        while(n!=0){
            m = m<<1;
            m |= n&1;
            n = n>>1;
        }
        return m;
    }
}
