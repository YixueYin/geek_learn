package Week8;

public class friendsCircle {

    public static void main(String[] args) {
        int[][] M = {{1,1,0}, {1,1,0}, {0,0,1}};
        System.out.println(findCircleNum(M));
    }

    public static int findCircleNum(int[][] M){
        /**
         * 解法1：类似于岛屿问题，找最大的相邻块
         */
        boolean[] visited = new boolean[M.length];
        int ret = 0;
        for(int i = 0; i< M.length; i++) {
            if(!visited[i]) {
                dfs(M, visited, i);
                ret++;
            }
        }
        return ret;
    }

    private static void dfs(int[][] m, boolean[] visited, int i) {
        for(int j = 0; j< m.length;j++) {
            if(m[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                dfs(m, visited, j);
            }
        }
    }
}
