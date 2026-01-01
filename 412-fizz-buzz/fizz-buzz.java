class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> r=new ArrayList<>();
        while(n>0){
            if(n%3==0 && n%5==0)
                r.add(0,"FizzBuzz");
            else if(n%3==0)
               r.add(0,"Fizz");
            else if( n%5==0)
                r.add(0,"Buzz");
            else{
                String s=""+n;
                r.add(0,s);
            }

         n--;
        }
        return r;
    }
}