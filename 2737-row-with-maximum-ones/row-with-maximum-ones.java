import java.util.Arrays;

class Solution {

    int countOnes(int[] arr) {

        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == 1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return arr.length - low;
    }

    public int[] rowAndMaximumOnes(int[][] mat) {

        int max = 0;
        int row = 0;

        for (int i = 0; i < mat.length; i++) {

            int count = countOnes(mat[i]);

            if (count > max) {
                max = count;
                row = i;
            }
        }

        return new int[]{row, max};
    }
}