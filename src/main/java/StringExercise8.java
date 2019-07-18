import java.util.ArrayList;
import java.util.List;

public class StringExercise8 {

    public String standardize(String str) {

        StringBuilder result = new StringBuilder();

        boolean allowSpace = false;
        boolean useUpper = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '.' || ch == '!' || ch == '?') {
                result.append(ch).append(' ');
                useUpper = true;
                allowSpace = false;
            } else if (ch == ' ') {
                if (allowSpace) {
                    result.append(' ');
                    allowSpace = false;
                }
            } else if (ch == ',') {
                result.append(ch).append(' ');
                useUpper = false;
                allowSpace = false;
            } else {
                if (useUpper) {
                    result.append(Character.toUpperCase(ch));
                    useUpper = false;
                } else {
                    result.append(Character.toLowerCase(ch));
                }
                allowSpace = true;
            }
        }

        return result.toString();
    }
}
