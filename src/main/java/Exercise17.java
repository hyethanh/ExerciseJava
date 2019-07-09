import java.util.ArrayList;
import java.util.List;

public class Exercise17 {
    public int count(int n) {
        int count = 1;
        while (n >= 10) {
            n /= 10;
            count++;
        }
        return count;
    }

    public boolean checkNumber(int n) {
        double sum = 0;
        int temp = n;
        int k;
        double m = count(temp);
        while (n > 0) {
            k = n % 10;
            sum = sum + Math.pow(k, m);
            n = n / 10;
        }
        if (sum == temp)
            return true;
        else
            return false;
    }

    public List<Integer> validNumber() {
        List<Integer> listOut = new ArrayList<Integer>();
        for (int i = 10; i < 100000; i++) {
            if (checkNumber(i) == true)
                listOut.add(i);
        }
        return listOut;
    }
}
