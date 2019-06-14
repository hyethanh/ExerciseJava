public class ArrayExercise9 {

    public int positionNumber(int[] arr, int n) {

        int right = arr.length - 1;
        int left = 0;
        int mid = (left + right) / 2;

        while (right >= left) {

            if (arr[mid] == n) {
                return mid;
            }
            if (arr[mid] > n) {
                right = mid - 1;
            }
            if (arr[mid] < n) {
                left = mid + 1;
            }
        }

        return -1;
    }
}

