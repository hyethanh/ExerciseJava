public class ArrayExercise9 {

    public int positionNumber(int[] arr, int n) {

        int right = arr.length - 1;
        int left = 0;

        while (right >= left) {

            int mid = (left + right) / 2;

            if (arr[mid] == n) {
                return mid;
            }
            else if (arr[mid] > n) {
                right = mid - 1;
            }
            else  {
                left = mid + 1;
            }
        }

        return -1;
    }
}

