public class Exercise25 {
    public int countNumber(int m,int n) {
        int a=0,b=1;
        int count = 0;
        while(b<=n){
            int c=a+b;
            a=b;
            b=c;
            if(a>=m)
                count++;
        }
        return count;
    }
}
