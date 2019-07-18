import java.util.ArrayList;

public class StringExercise6 {

    public String upDownCaseString(String input){

        char[] str = input.toCharArray();
        StringBuilder result = new StringBuilder();

        for(char s:str){
            if(Character.isLowerCase(s)){
                s=(char) (s - 32);
            }
            else if(Character.isUpperCase(s)){
                s=(char) (s + 32);
            }
            result.append(s);
        }


        return result.toString();
    }

}
