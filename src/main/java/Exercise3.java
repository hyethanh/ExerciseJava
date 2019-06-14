public class Exercise3 {
    public String mullPrime(int n){

        StringBuilder result= new StringBuilder();
        int i = 2;

        while(n>=i) {
            if(n%i==0) {

                result.append(i);
                n=n/i;

                if(n>1){
                    result.append("*");
                }
            }
            else{
                i++;
            }
        }

        return result.toString();
    }
}
