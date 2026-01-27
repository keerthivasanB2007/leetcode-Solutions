class Solution {
    List<List<Integer>> r= new ArrayList<>();
   void per(int[] num,int[] i,List<Integer> l){
      
        if(l.size()==num.length )
        {
       
            r.add(l); 
            return;
        }
        for(int j=0;j<num.length;j++){
            if(i[j]!=1){
                int []c=Arrays.copyOf(i,i.length);
                c[j]=1;
                List<Integer> b=new ArrayList<>(l);
                b.add(num[j]);
               
                per(num,c,b);
            }
        }
    }
   public List<List<Integer>> permute(int[] nums) {
        List< Integer> l=new ArrayList<>();
        if(nums.length==1)
        {
            l.add(nums[0]);
            r.add(l);
            return r;
        }
        int []i=new int[nums.length];
        
        
        per(nums,i,l);
        return r;
    }
}