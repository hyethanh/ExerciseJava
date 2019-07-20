public class StringExercise10 {

    public String extendString(String str) {

        StringBuilder result = new StringBuilder();
        int count;
        String temp = "";

        for (int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                result.append(str.charAt(i));
            }
           else {
                count = Character.getNumericValue(str.charAt(i));
                while (count != 1) {
                    result.append(str.charAt(i - 1));
                    count--;
                }
            }
        }

        return result.toString();
    }
}
