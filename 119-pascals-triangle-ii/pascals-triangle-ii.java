class Solution {
    public List<Integer> getRow(int rowIndex) {
         Integer []t=new Integer[1];
        t[0]=1;
       //List<Integer> R=new ArrayList<>();
       List<List<Integer>> r=new ArrayList<>();
       r.add(Arrays.asList(t));
       if(rowIndex==0)    
          return r.get(rowIndex);
       for(int n=2;n<=(rowIndex+1);n++){
        t=new Integer[n];
        t[0]=1;
        t[n-1]=1;
        int k=1,i=0,j=1;
        while(j<n-1 &&  j!=i){
           
            t[k]=r.get(n-2).get(i) + r.get(n-2).get(j);
            i++;
            j++;
            k++;
           
        }
         r.add(Arrays.asList(t));
         k=0;
       }
       return r.get((rowIndex));
    }
}