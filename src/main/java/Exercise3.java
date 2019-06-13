public class Exercise3 {
    public String mullPrime(int n){
        String result="";
        int i = 2;
        while(n>=i) {
            if(n%i==0) {
                result += i+"*";
                n=n/i;
            }
            else i++;

        }
        result = result.substring(0,result.length()-1);
        return result;
    }
}
