public class Exercise10 {
    public double PI(){
        int i=2;
        int j=0;
        double pi=0;
        double a = 1.0/(i*(i+1)*(i+2));
        while(a>=0.00001){
            pi+=4*(Math.pow(-1,j)*a);
            j++;
            i+=2;
            a = 1.0/(i*(i+1)*(i+2));
        }
        return (3+pi);
    }
}
