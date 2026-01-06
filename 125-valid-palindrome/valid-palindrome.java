class Solution {
    public boolean isPalindrome(String s) {
    
         int i=0;
         int j=s.length()-1;
        
       while(i<j){
         char c=s.charAt(i);
         char x=s.charAt(j);
        if(!(((c>='a' && c<='z') || (c<='Z' && c>='A')) || (c>='0' && c<='9'))){
               i++;
               continue;
           
        }
        if(!(((x>='a' && x<='z') || (x<='Z' && x>='A')) || (x>='0' && x<='9'))){
            j--;
            continue;
        }

        if(  (Character.toLowerCase(x)!=Character.toLowerCase(c))){
            return false;
        }
        
            i++;
            j--;
        
       }
       return true;
        }
    }