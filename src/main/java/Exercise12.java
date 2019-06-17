public class Exercise12 {

    public int factorial(int m) {
        int p = 1;
        if (m == 0 || m == 1)
            return p;
        else {
            for (int i = 2; i <= m; i++) {
                p = p * i;
            }
        }
        return p;
    }

        public double expression (int n) {
            double s = 1.0;

            for (int i = 1; i <= n; i++) {
                System.out.println(factorial(i));
                s = s + (1 / factorial(i));

            }
            return s;
        }

        public static void main(String [] args){
        Exercise12 a = new Exercise12();
        double x=1.0;
            System.out.println(a.factorial(3));
            for (int i = 1; i <= 3; i++) {
                x = x + (float)(1 / a.factorial(i));
            }
        System.out.println(x);

        }

}
