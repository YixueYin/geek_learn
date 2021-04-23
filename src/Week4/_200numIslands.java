package Week4;

public class _200numIslands {
    private int n;
    private int m;
    public int numIslands(char[][] grid) {
        //初始化岛屿的个数
        int count = 0;
        //将整个地图的长宽先计算出来
        n = grid.length;
        m = grid[0].length;
        if(n == 0) return 0;
        //遍历每一个像素点，如果遇到1，就将它所有相邻的1都夷为平地
        for(int i =0;i<n;i++) {
            for(int j = 0; j<m;j++) {
                if(grid[i][j] == '1') {
                    DFSMarking(grid, i, j);
                    ++count;
                }
            }
        }
        return count;
    }

    private void DFSMarking(char[][] grid, int i, int j) {
        //老生常谈：终止条件
        //1不能超过长 2不能超过高 3节点值要是1
        if(i<0 || i>=n || j>=m || j<0 || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '0';
        //向四个方向延伸
        DFSMarking(grid, i-1, j);
        DFSMarking(grid, i+1, j);
        DFSMarking(grid, i, j-1);
        DFSMarking(grid, i, j+1);
    }
}
