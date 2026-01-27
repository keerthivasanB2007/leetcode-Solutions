class Solution {
    List<String> r=new ArrayList<>();
    void per(char[] c,String s,int i){
            if(s.length()==c.length){
                r.add(s);
                return;
            }
            String t=c[i]+"";

                if(Character.isLetter(c[i])){
                    
                 
                       String x=s+t.toLowerCase();
                       per(c,x,i+1);
                       String y=s+t.toUpperCase();
                       per(c,y,i+1);

                }
                else{
                    per(c,s+t,i+1);
                }
                
            }

    public List<String> letterCasePermutation(String s) {
        String l=new String();
        l="";
        /*if(nums.length==1)
        {
            l.add(nums[0]);
            r.add(l);
            return r;
        }*/
      //  int []i=new int[nums.length];
        
        char nums[]=s.toCharArray();
        per(nums,l,0);
        return r;
    }
}