public class StringExercise12 {

    public String deleteDuplicateLetter(String str) {

        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (result.length() == 0 || result.charAt(result.length() - 1) != ch) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
