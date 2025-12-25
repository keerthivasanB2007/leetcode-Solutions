class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
     int n=numRows;
     String t[]=new String[n];
     int i=0;
      Arrays.fill(t,"");
     while(i<s.length()){
       
        for(int k=0;k<n && i<s.length();k++){
            String c=Character.toString(s.charAt(i));
           
        t[k]=t[k]+c;
            i++;
        }
 
    
        for(int k=n-2;k>0 && i<s.length();k--){
             
               String c=Character.toString(s.charAt(i));
            t[k]=t[k]+c;
            i++;
        }
      
     }   
     String r="";
      for(int j=0;j<n;j++){
          r=r+t[j];
          
      }
      return r;
    }
}