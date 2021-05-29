package Week8;

public class _200numIslands {
    public int row;
    public int col;
    public int numIslands(char[][] grid) {
        //中心思想：遍历数组中的每一个点，如果遇到1，就将其周围的所有点都夷为平地
        //再count++
        row = grid.length;
        col = grid[0].length;
        int count = 0;
        if(row == 0) {
            return 0;
        }
        for(int i = 0; i< row; i++) {
            for(int j = 0; j< col; j++) {
                if(grid[i][j] == '1') {
                    DFSMarking(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public void DFSMarking(char[][] grid, int i, int j) {
        //如果超出边界线
        if(i >= row || i < 0 || j>= col || j < 0 || grid[i][j] != '1') {
            return;
        }
        //当前节点夷为平地
        grid[i][j] = '0';
        //从当前节点出发，辐射到上下左右的其他为1的节点
        DFSMarking(grid, i-1, j);
        DFSMarking(grid, i+1, j);
        DFSMarking(grid, i, j-1);
        DFSMarking(grid, i, j+1);
    }
}







// private int n;
// private int m;
// public int numIslands(char[][] grid) {
//     //初始化岛屿的个数
//     int count = 0;
//     //将整个地图的长宽先计算出来
//     n = grid.length;
//     m = grid[0].length;
//     if(n == 0) return 0;
//     //遍历每一个像素点，如果遇到1，就将它所有相邻的1都夷为平地
//     for(int i =0;i<n;i++) {
//         for(int j = 0; j<m;j++) {
//             if(grid[i][j] == '1') {
//                 DFSMarking(grid, i, j);
//                 ++count;
//             }
//         }
//     }
//     return count;
// }

// private void DFSMarking(char[][] grid, int i, int j) {
//     //老生常谈：终止条件
//     //1不能超过长 2不能超过高 3节点值要是1
//     if(i<0 || i>=n || j>=m || j<0 || grid[i][j] != '1') {
//         return;
//     }
//     grid[i][j] = '0';
//     //向四个方向延伸
//     DFSMarking(grid, i-1, j);
//     DFSMarking(grid, i+1, j);
//     DFSMarking(grid, i, j-1);
//     DFSMarking(grid, i, j+1);
// }

