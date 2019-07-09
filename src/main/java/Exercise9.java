import static java.lang.Math.*;

public class Exercise9 {
    public double PI(){
        int i = 0;
        double a = 1/(2*i+1);
        double pi = 0;
        while(a>=0.0001){
            pi+=Math.pow(-1,i)*a;
            i++;
            a = 1.0/(2*i+1);
        }
        pi *=4;
        return pi;
    }
}
