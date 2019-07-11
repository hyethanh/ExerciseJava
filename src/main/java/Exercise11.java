public class Exercise11 {
    public double interest(double m,double n){
        double a=0;
        int i=1;
        double laisuat=1.0/n;
        while(i<=n){
            a = m+m*laisuat;
            i++;
            m=a;
        }
        return a;
    }
}
