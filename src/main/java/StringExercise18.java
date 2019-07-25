public class StringExercise18 {

    public int getNumberic(String str, int i) {

        if (i < str.length()) {
            return str.charAt(str.length() - i - 1) - '0';

        }

        return 0;
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

    public String multiplyString(String str1,String str2){

        StringBuilder result = new StringBuilder();
        int memory=0;

        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){

                int mul = getNumberic(str1,i)*getNumberic(str2,j)+memory;
                memory = mul/10;
                mul = mul%10;
                result.insert(0,mul);

                if(i==str1.length()-1&&j==str2.length()-1){
                    if(memory!=0){
                        result.insert(0,memory);
                    }

                }

            }

        }
        return result.toString();

    }
}
