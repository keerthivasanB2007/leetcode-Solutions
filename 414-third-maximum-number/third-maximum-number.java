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
            if(s.size()>3){
                s.pollFirst();
            }
        }
       
        return s.size()==3?s.pollFirst():s.pollLast();
    }
}