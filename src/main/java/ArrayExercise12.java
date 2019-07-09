import java.util.Arrays;

public class ArrayExercise12 {

    public int[] insertArray(int[] arr,int n){

        int[] a = new int[arr.length+1];
        int j=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<=n) {
                a[i] = arr[i];
                j = i + 1;
            }
        }
        a[j]=n;

        for(int i=j+1;i<a.length;i++){
            a[i]=arr[i-1];
        }

        return a;
    }
}
