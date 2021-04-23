package Week4;

public class _74searchMatrix {
    //1. 一次二分查找，巧妙使用模
//    public boolean searchMatrix(int[][] matrix, int target) {
//        int m = matrix.length, n = matrix[0].length;
//        int low = 0, high = m * n - 1;
//        while (low <= high) {
//            int mid = (high - low) / 2 + low;
//            int x = matrix[mid / n][mid % n];
//            if (x < target) {
//                low = mid + 1;
//            } else if (x > target) {
//                high = mid - 1;
//            } else {
//                return true;
//            }
//        }
//        return false;
//    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        //除了传统的二分查找，还有建立直角坐标系的巧妙做法
        //因为根据图片，某一个数字的上面一定比它小，右面一定比它大
        //所以只需要从最左下角的元素出发，如果当前元素比target小，那么就往右移一格
        //如果当前元素比target大，那么就往上移一格
        int row = matrix.length;
        int col = matrix[0].length;
        int x = row-1;
        int y = 0;
        while(x >= 0 && y < col) {
            if(matrix[x][y] == target) {
                return true;
            }
            if(matrix[x][y] > target) {
                x--;
            }else if (matrix[x][y] < target) {
                y++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix,target));
    }
}
