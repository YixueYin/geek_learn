package Week5;

public class _63uniquePathsWithObstacles {
    public static void main(String[] args) {
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] dp = new int[row][col];
        //根据规则初始化数组
        for(int i = 0; i<row && obstacleGrid[i][0] == 0; i++) {
            dp[i][0] = 1;
        }
        for(int j = 0; j<col && obstacleGrid[0][j] == 0; j++) {
            dp[0][j] = 1;
        }
        //dp传递
        for(int i = 1; i< row;i++) {
            for(int j= 1; j<col; j++) {
                if(obstacleGrid[i][j] == 0) {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[row-1][col-1];
    }
}
