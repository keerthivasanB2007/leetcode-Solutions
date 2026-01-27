class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char x[]=s1.toCharArray();
        Arrays.sort(x);
        s1=new String(x);
        int i=0;
        int j=s1.length();
        boolean f=false;
        while(j<=s2.length()){
            String s=s2.substring(i,j);
           char y[]=s.toCharArray();
           Arrays.sort(y);
           s=new String(y);
           if(s.equals(s1))
            {
              
                f=true;
                break;
            }
            i++;
            j++;
        }
        return f;
    }
}