public class Exercise27 {

    public int countZero(int n) {

        int count = 0;
        int k=5;

        if (n == 0) {
            return 0;
        }

        while(k<=n){
            count +=n/k;
            k *=5;
        }

        return count;
    }
}
