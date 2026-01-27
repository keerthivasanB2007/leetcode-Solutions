class Solution {
    
    
  int q=0;
  String r="";
  int m=1;
   void per(int[] i,String l){
     
        if(l.length() == (i.length-1)  )
        {
          
            if(m==q)
               r=l;
            m++;
            return;
        }
        

        for(int j=0;j<=i.length+1;j++){
            if((j+1)<i.length && i[j+1]!=1){
                int []c=Arrays.copyOf(i,i.length);
                c[j+1]=1;
                String b=l+(j+1);      
                per(c,b);
            }
        }
    }
    public String getPermutation(int n, int k) {
      String l=new String();
      l="";
      q=k;
      
        int []i=new int[n+1];
        
        
        per(i,l);
        return r;
    }
}