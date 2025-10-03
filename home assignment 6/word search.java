class Solution {
    public int n, m;
    public boolean exist(char[][] board, String word) {
        n=board.length;
        m=board[0].length;
        boolean[][] vis = new boolean[n][m];
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board,vis,word,i,j,0)) return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, boolean[][] vis, String word, int row, int col, int k) {
        if (row<0 || row>=n || col<0 || col>=m || vis[row][col] || board[row][col]!=word.charAt(k)) {
            return false;
        }
        if (k==word.length()-1) return true;
        vis[row][col] = true;
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        for (int a=0;a<4;a++) {
            if (dfs(board,vis,word,row+dx[a],col+dy[a],k+1)) return true;
        }
        vis[row][col] = false;
        return false;
    }
}
