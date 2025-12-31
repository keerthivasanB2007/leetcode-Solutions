class Solution {
    public boolean isHappy(int n) {
         Set<Integer> r=new HashSet<>();
     int sum=0;
          while(sum!=1){
           sum=0;
            while(n>0){
              sum=sum+ (n%10)*(n%10);
              n=n/10;
            }
            n=sum;
            if(r.contains(sum)){
                return false;
            }
            r.add(sum);
           
          }
          return true;
    }
}