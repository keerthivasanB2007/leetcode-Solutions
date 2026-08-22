class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int temp = n;
        while(n > 0){
            int digit = n%10;
            sum = sum + digit;
            product = product*digit;
            n = n/10;
        }
        System.out.println("sum="+sum);
        System.out.println("Product="+product);
        if( temp%(sum + product)==0)
           return true;
        return false;
    }
}