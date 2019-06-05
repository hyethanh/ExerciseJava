public class Exercise5 {
    public void Fibonaci(int n){
        int a = 1;
        int b = 1;
        int c;
        for(int i= 3; i<=n;i++){
            c = a + b;
            a = b;
            b = c;
        }
    }
}
