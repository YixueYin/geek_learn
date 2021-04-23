package Week4;

public class Additional {
    public static void main(String[] args) {
        int[] matrix = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("The unsorted part index is " + findTheUndistortedPart(matrix));
    }

    private static int findTheUndistortedPart(int[] matrix) {
        //binary search
        int low = 0;
        int high = matrix.length - 1;
        while (low < high) {
            int pivot  = low + (high - low) / 2;
            if(matrix[pivot] < matrix[high]) {
                high = pivot;
            } else {
                low = pivot + 1;
            }
        }
        return low;
    }
}
