import java.util.Arrays;

public class StringExercise18 {

    public int getNumberic(String str, int i) {

        if (i < str.length()) {
            return str.charAt(str.length() - i - 1) - '0';

        }

        return 0;
    }

    public String genZeros(int n){
        char[] chars = new char[n];
        Arrays.fill(chars, '0');
        return new String(chars);
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

    public String multiplyString (String str1,String str2) {

        StringBuilder sb = new StringBuilder();
        String temp = sb.toString();

        for(int i=str2.length()-1;i>=0;i--){

                temp = addString(temp, multiplyString(str1,str2.charAt(i)-'0')+genZeros(str2.length() - 1 - i));
            }
        sb.append(temp);

        return sb.toString();
    }

    public String multiplyString(String str, int n){

        StringBuilder sb = new StringBuilder();
        int memory=0;

        for(int i=str.length()-1;i>=0;i--){

            int t = n*(str.charAt(i)-'0')+memory;
            //sb.append(t%10);
            sb.insert(0,t%10);
            memory = t/10;
        }

        if(memory!=0){
            sb.insert(0,memory);
        }

    return sb.toString();
    }
}
