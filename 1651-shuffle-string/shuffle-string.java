class Solution {
    public String restoreString(String s, int[] indices) {
        char c[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
           
            char y=s.charAt(i);
         
             int j=indices[i];
               
             c[j]=y;
             
            
        }
        
        return new String(c);
    }
}