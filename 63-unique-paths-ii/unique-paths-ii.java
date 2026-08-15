class Solution {
    
     int[][] mat ;
     int M;
     int N;
     int path(int[][] x,int i,int j){
        
        if(i>=M || j>=N)
          return 0;
        if(i==(M-1) && j==(N-1))
           return 1;
          
        if(mat[i][j]!=0)
           return mat[i][j];
        int down =0;
       
        if( (i+1)<M && x[i+1][j]!=1){
          //   System.out.println("x[i+1][j]="+x[i+1][j]);
           down = path(x,i+1,j);
        }
        int right =0;
        if((j+1)<N && x[i][j+1]!=1){
           // System.out.println("x[i][j+1]="+x[i][j+1]);
            right = path(x,i,j+1);
        }
        mat[i][j] = down + right;
        return mat[i][j];
        
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0]==1)
          return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        M = m;
        N = n;
        mat = new int[m][n];
         
      return path(obstacleGrid,0,0);
    }
}