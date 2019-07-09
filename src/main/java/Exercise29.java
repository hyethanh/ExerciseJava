public class Exercise29 {

    public int changeRomanNumber(String number) {

        int result = 0;
        int[] dec = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < dec.length; i++) {
            while (number.indexOf(roman[i]) == 0) {
                result += dec[i];
                number = number.substring(roman[i].length());
            }
        }
        return result;
    }
}
