class Solution {
    public int myAtoi(String s) {
        if(s=="" || s==null)
           return 0;
        int i=0;
        while(i<s.length())
        {
            if(s.charAt(i)==' ')
                i++;
            else
               break;
        }
        if(i>=s.length())
          return 0;
       int sign=1;
       if(s.charAt(i)=='-'){
        sign=-1;
        i++;
       }
       else if(s.charAt(i)=='+')
       {
        sign=1;
        i++;
       }
       while(i<s.length()){
        if(s.charAt(i)=='0'){
            i++;
        }
        else
            break;
       }
       int start = i;
       while(i<s.length())
       {
        if(s.charAt(i)>='0' && s.charAt(i)<='9'){

            i++;
        }
        else{
            break;
        }
       }
       String m ="0";
        int max=Integer.MAX_VALUE;
     int min = Integer.MIN_VALUE;
       if(start!=i)
         m=s.substring(start,i);
        long n = 0;
         
         int j=0;
         while(j<m.length()){
            char h = m.charAt(j);
            if(h<'0' || h>'9')
               break;
            n=n*10+(h-'0');
         
           
            if(n*sign<min)
             return min;
            if(n*sign>max)
              return max; 
            j++;
         }
   
     n= n*sign;
    
   
     
       return (int)n;


            

    }
}