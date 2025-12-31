class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length-1;

       for(int i=0;i<=(n-1);i++){
         int k=n;
            for(int j=i;j<n;j++){
                int[] b={i,j};
                int t=matrix[j][n];
                matrix[j][n]=matrix[i][j];

                int t1=matrix[n][k];
                matrix[n][k]=t;
               

                t=matrix[k][i];
                matrix[k][i]=t1;
              
               matrix[b[0]][b[1]]=t;
               k--;
            }
            n--;
           
        }
    }
}