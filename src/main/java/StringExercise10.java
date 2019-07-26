public class StringExercise10 {

    public String extendString(String str) {

        StringBuilder result = new StringBuilder();
        int count = 0;

        char previous = str.charAt(0);

        for (int i = 1; i <= str.length(); i++) {

            if (i < str.length() && Character.isDigit(str.charAt(i))) {
                count = 10 * count + str.charAt(i) - '0';
            }

            if (i == str.length() || !Character.isDigit(str.charAt(i))) {
                for (int j = 0; j < Math.max(1, count); j++) {
                    result.append(previous);
                }
                count = 0;

                if (i < str.length()) {
                    previous = str.charAt(i);
                }
            }
        }

        return result.toString().trim();
    }
}
