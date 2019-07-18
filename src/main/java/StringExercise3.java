public class StringExercise3 {

    public String symmetric(String s) {

        char[] str = s.toCharArray();
       for(int i=0;i<s.length();i++){
           if(str[i]!=str[s.length()-i-1]){
                return "Chuoi khong doi xung";
           }
        }
        return "Chuoi doi xung";
    }
}
