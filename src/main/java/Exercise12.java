public class Exercise12 {

    public double expression (int n) {
        double s = 1;
        double temp = 1;
        for(int i=1;i<=n;i++){
            temp /= i;
            s += temp;
        }
        return s;
    }
}
