class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length-1;

       for(int i=0;i<=(n-1);i++){
         int k=n;
            for(int j=i;j<n;j++){
                int[] b={i,j};
                int t=matrix[j][n];
                matrix[j][n]=matrix[i][j];
                System.out.println("ij="+i+j);
                System.out.println("jn="+j+n);

                int t1=matrix[n][k];
                matrix[n][k]=t;
                System.out.println("nk="+n+k);

                t=matrix[k][i];
                matrix[k][i]=t1;
                System.out.println("ki"+k+i);
               matrix[b[0]][b[1]]=t;
               k--;
            }
            n--;
            System.out.println("n="+n);
        }
    }
}