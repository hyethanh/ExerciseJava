public class StringExercise6 {

    public String upDownCaseString(String input) {

        char[] str = input.toCharArray();
        StringBuilder result = new StringBuilder();

        for (char s : str) {
            if (Character.isLowerCase(s)) {

                s = Character.toUpperCase(s);

            } else  {

                s = Character.toLowerCase(s);
            }
            result.append(s);
        }

        return result.toString();
    }
}
