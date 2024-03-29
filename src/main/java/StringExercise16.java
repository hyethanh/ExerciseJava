public class StringExercise16 {

    public int getNumberic(String str, int i) {
        if (i < str.length()) {
            return str.charAt(str.length() - i - 1) - '0';
        }
        return 0;
    }

    public String addString(String str1, String str2) {

        StringBuilder sb = new StringBuilder();

        int memory = 0;
        int length = Math.max(str1.length(), str2.length());

        for (int i = 0; i < length; i++) {

            int sum = getNumberic(str1, i) + getNumberic(str2, i) + memory;

            sb.insert(0, sum % 10);

            memory = sum / 10;
        }

        if (memory == 1) {
            sb.append(memory);
        }

        return sb.toString();
    }
}
