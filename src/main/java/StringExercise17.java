public class StringExercise17 {

    public int getNumberic(String str, int i) {

        if (i < str.length()) {
            return str.charAt(str.length() - i - 1) - '0';

        }

        return 0;
    }

    public String subtractString(String str1, String str2) {

        StringBuilder result = new StringBuilder();

        int length = Math.max(str1.length(), str2.length());
        int memory = 0;

        if (str1.length() < str2.length() || str1.length() == str2.length() && str1.compareTo(str2) < 0) {
            return "-" + subtractString(str2, str1);
        }

        for (int i = 0; i < length; i++) {

            int sub = getNumberic(str1, i) - getNumberic(str2, i) - memory;

            if (getNumberic(str1, i) < getNumberic(str2, i)) {

                memory = 1;
                sub = memory * 10 + getNumberic(str1, i) - getNumberic(str2, i);

                result.insert(0, sub);
            } else {

                result.insert(0, sub);
                memory = 0;

            }
        }

        if (result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }


        return result.toString();
    }
}
