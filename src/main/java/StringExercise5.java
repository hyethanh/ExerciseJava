import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StringExercise5 {


    public String[] findDuplicatedWords(String input) {

        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();

        for (String str : input.split(" ")) {
            if(words.indexOf(str)>=0 && words.indexOf(str) == words.lastIndexOf(str)){
                result.add(str);
            }
            words.add(str);
        }

        return result.toArray(new String[0]);
    }
}
