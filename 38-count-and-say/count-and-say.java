class Solution {
    public String solve(int n)
    {
        if(n==1)
          return "1";
        
        String t = solve(n-1);
        // System.out.println(t);
       // HashMap<Integer,Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
       int i =0;
       int j =0;
       while(j<t.length()){
        int x = Integer.parseInt(t.charAt(i)+"");
        int y = Integer.parseInt(t.charAt(j)+"");
        if(x==y){
            j++;
        }
        else{
            // System.out.println("coutn = "+(j-i));
            // System.out.println("k = "+t.charAt(i));
            result.append(j-i);
            result.append(t.charAt(i));
            i=j;
        }
       }
          result.append(j-i);
            result.append(t.charAt(i));
            return result.toString();
    }
    public String countAndSay(int n) 
    {
        return solve(n);
    }
}