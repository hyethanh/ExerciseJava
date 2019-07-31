public class Exercise30 {

    public String convert(int n) {

        String s = "";
        int i = 0;

        String[] arrRoman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] dec = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        while (n > 0) {

            while (n >= dec[i]) {

                s += arrRoman[i];
                n -= dec[i];

            }

            i++;
        }
        return s;
    }

}
