public class ArrayExercise3 {

    public int sub(int[] arr){

        int sum1=0;
        int sum2=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum1 += arr[i];
            }
            else{
                sum2 += arr[i];
            }
        }
        return (sum1-sum2);
    }
}
