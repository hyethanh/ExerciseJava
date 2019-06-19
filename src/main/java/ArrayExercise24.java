public class ArrayExercise24 {

    public int greastCommonDivisor(int a, int b){

        if (a == 0 || b == 0)
            return (a + b);
        else {
            while (a != b) {
                if (a > b)
                    a -= b;
                else
                    b -= a;
            }
        }

        return a;
    }

    public int leastCommonMultiple(int a, int b){

        int x = greastCommonDivisor(a, b);

        return a * b / x;
    }

    public int leastCommonMultipleArray(int[] arr){

        int temp = leastCommonMultiple(arr[0],arr[1]);

        for(int i=2;i<arr.length;i++){
            temp = leastCommonMultiple(temp,arr[i]);
        }

        return temp;
    }
}
