class Solution {
   
     int[][] mat ;
     int M;
     int N;
     int path(int i,int j){
        
        if(i>=M || j>=N)
          return 0;
        if(i==(M-1) && j==(N-1))
           return 1;
        if(mat[i][j]!=0)
           return mat[i][j];
        
        mat[i][j] = path(i+1,j) + path(i,j+1);
        return mat[i][j];
        
    }
    public int uniquePaths(int m, int n) {
        mat = new int[m][n];
      
           M = m;
        N = n;
    return path(0,0);
    }
}