class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> r=new ArrayList<>();
        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        while(left<=right && top<=bottom){
              for(int j=left; j<=right;j++)
               r.add(matrix[top][j]);
               top++;

               for(int i=top;i<=bottom;i++)
                 r.add(matrix[i][right]);
                 right--;
                if(top<=bottom){
                    for(int j=right;j>=left;j--)
                    r.add(matrix[bottom][j]);
                    bottom--;           
                }
                if(left<=right){
                    for(int i=bottom;i>=top;i--)
                      r.add(matrix[i][left]);
                      left++;
                }
        }
        return r;
    }
} 