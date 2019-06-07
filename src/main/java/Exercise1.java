public class Exercise1 {

    public int ucln(int a, int b) {
        if (a == 0 || b == 0)
            return (a+b);
        else {
            while (a != b) {
                if (a > b)
                    a -= b;
                else
                    b -= a;
            }
        }
        return a;
    }

    public int bcnn(int a, int b){
        int x;
        x= ucln(a,b);
        return a * b / ucln(a, b) ;
    }
}
