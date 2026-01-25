class Solution {
  List<List<String>> r1=new ArrayList<>();
    void f(int [][]m,List<String> r,int i,int n){
        if(i==n){
            r1.add(new ArrayList<>(r));
          return;
        }
        
        int x=0;
    
        while(x<n){
          int t=i;
            if(m[t][x]!=1)
                {
                   char []c=new char[n];
                   Arrays.fill(c,'.');
                   c[x]='Q';
                   String s=new String(c);
                   r.add(s);
                    int backup[][]=new int[n][n];
                    for(int w=0;w<n;w++){
                        backup[w]=m[w].clone();
                    }
        int j=x;
      
        
        while(t<n){
            m[t][j]=1;
            t++;
        }
        t=i;
        int y=j;
        
        while(y>=0 && t<n){
            m[t][y]=1;
            t++;
            y--;
        }
        t=i;
        y=j;
        while(y<n && t<n){
            m[t][y]=1;
            t++;
            y++;
        }
        f(m,r,i+1,n);
        r.remove(r.size()-1);
        for(int a=0;a<n;a++){
            m[a]=backup[a].clone();
        }
   
        }
             x++;
        }

    }
    public List<List<String>> solveNQueens(int n) {
        int [][]m=new int[n][n];
                  List<String> r=new ArrayList<>();
    
        f(m,r,0,n);
      

        return r1;

    }
}