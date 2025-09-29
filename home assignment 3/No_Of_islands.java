class Solution {
    public int numIslands(char[][] grid) {
        int cnt = 0;
        int[][] vis = new int[grid.length][grid[0].length];
        for (int[] a : vis) {
            Arrays.fill(a,-1);
        }
        for (int i=0;i<grid.length;i++) {
            for (int j=0;j<grid[i].length;j++) {
                if (vis[i][j]==-1 && grid[i][j]=='1') {
                    cnt++;
                    dfs(i,j,vis,grid);
                }
            }
        }
        return cnt;
    }
    void dfs(int i, int j, int[][] vis, char[][] grid) {
        if (i<0 || j<0 || i>=grid.length || j>=grid[0].length) {
            return;
        }
        int[] delr = {-1,0,0,1};
        int[] delc = {0,-1,1,0};
        for (int x=0;x<4;x++) {
            int nr =i+delr[x];
            int nc =j+delc[x];
            if (nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length &&
                vis[nr][nc]==-1 && grid[nr][nc]=='1'){
                vis[nr][nc]=0;
                dfs(nr,nc,vis,grid);
            }
        }
    }
}
