class Solution {
    public int reverse(int x) {
          
     long r=0;
        while(x!=0){
            r=r*10+(x%10);
            x=x/10;
        }
          int h=(int )Math.pow(2,31);
         
       if( r<0 && r>=(-h)   ){
             int t=(int)r;
         return t;
       }
        if(r>0 &&  r<((h)-1)){
             
              int t=(int)r;
         return t;
        }
       return 0;
   
    }
}