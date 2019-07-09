import java.util.List;

public class ArrayExercise2 {

    public int sum(int[] arr){
        int sum=0;

        sortDES(arr);
        sum = arr[0]+arr[1]+arr[2];

        return sum;
    }

    public void sortDES(int[] arr){
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            for (int j=i;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
}
