class Solution {
    int[] midSign = new int[2];
    int x=0;
    int getReal(String n){
        int sign = 1;
        int i=0;
        // if(n.charAt(0)=='+'){
        //   sign=+1;
        //     i++;
        // }
        // if(n.charAt(0)=='-'){
        //   sign=-1;
        //   i++;
        // }
        
        while(i<n.length()){
            if(n.charAt(i)=='+')
                break;
            i++;

        }
       // System.out.println("sign = "+sign);
        midSign[x++]=i;
        String s = n.substring(0,i);
        int r = Integer.parseInt(s);
     
        return r;
    }
    int getImg(String n)
    {

         int c = midSign[--x] + 1;
         int sign = 1;
         if(n.charAt(c)=='-'){
            sign = -1;
            c++;
         }
         int start =c;
         while(c<n.length()){
            if(n.charAt(c)=='i')
            {
                break;
            }
            c++;
         }
         String s =n.substring(start,c);
         int r = Integer.parseInt(s);
         return r*sign;
    }
    public String complexNumberMultiply(String num1, String num2) {
            int a = getReal(num1);   
            int x = getReal(num2);
        

             int y = getImg(num2);
            int b = getImg(num1);
            
           
            int real = (a*x - b*y);
            int img = (a*y + b*x);

            return real + "+" + img + "i" ;
    }
}