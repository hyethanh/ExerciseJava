public class StringExercise9 {

    public String abridgeString(String str) {

        StringBuilder result = new StringBuilder();
        int count = 1;
        str = str + " ";

        result.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1)) {

                count++;

            } else {
                if (count != 1) {

                    result.append(count);
                    count = 1;

                }
                result.append(str.charAt(i));
            }
        }

        return result.toString().trim();
    }
}

