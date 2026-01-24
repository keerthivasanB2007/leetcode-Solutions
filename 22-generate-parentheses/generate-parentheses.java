class Solution {
    List<String> s=new ArrayList<>();
    void par(int o,int c,int n,String r){
           
        if(o<c || o>n)
           return;
        if(r.length() == 2*n){
            s.add(r);
            return;
        }

        par(o,c+1,n,r+")");
        par(o+1,c,n,r+"(");
    }

    public List<String> generateParenthesis(int n) {
         String r="(";
        par(1,0,n,r);
        return s;
        
    }
}