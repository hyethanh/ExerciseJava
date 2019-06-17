public class Exercise3 {
    public String mullPrime(int n){
        String result="";
        int i = 2;
        while(n>0) {
            if(n%i==0) {
                result += i + "*";
                n=n/i;
            }
            else i++;
        }
        result = result.substring(0);
        return result;
    }
}
