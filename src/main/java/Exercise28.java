public class Exercise28 {

    public double squareRoot(double n) {

        double result, tmp;

        tmp = (n + 1) / 2;

        do {
            result = tmp;
            tmp = 0.5 * (tmp + n / tmp);
        } while (Math.abs(tmp - result) > 0.0001);

        return result;
    }
}
