public class Solution {
    public int uniquePaths(int m, int n) {
        return countPaths(0,0,m,n);
    }
    private int countPaths(int row,int col,int m,int n) {
        if (row==m-1 && col==n-1){
            return 1;
        }
        if (row>=m || col>=n){
            return 0;
        }
        int downPaths = countPaths(row+1,col,m,n);
        int rightPaths = countPaths(row,col+1,m,n);
  
        return downPaths + rightPaths;
    }
}
