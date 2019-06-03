public class Exercise2 {

    public void mul(int n){
        int i = 2;
        while(n>0) {
            if(n%i==0) {
                System.out.print(i+"  ");
                n=n/i;
            }
            else i++;
        }
    }
}
