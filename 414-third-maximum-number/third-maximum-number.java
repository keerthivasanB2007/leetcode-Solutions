class Solution {
    public int thirdMax(int[] nums) {
         int n = nums.length;
        if(n==1)
          return nums[0];
        if(n==2)
          return nums[1];

        // PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // for(int i : nums){
        //     minHeap.add(i);
        //     if(minHeap.size() > 3){
        //         minHeap.poll();
        //     }
        // }
        // System.out.println(minHeap);
        // return minHeap.poll();
        // Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        TreeSet<Integer> s = new TreeSet<>();
        for(int i:nums){
            s.add(i);
        }
       
        Iterator<Integer> i = s.descendingIterator();
        int c = 3;
        Integer r = null;
        while(c!=0){
            if(i.hasNext())
                r=i.next();
            else
               {
                r=null;
                break;
               }
               c--;

        }
        if(r==null)
          return s.last();
        return r;
    }
}