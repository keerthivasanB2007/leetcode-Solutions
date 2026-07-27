/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   
    HashMap<Integer,Integer> map = new HashMap<>();

    public void fun(TreeNode root, int h){
            if(root==null)
                return;
            
            if(map.containsKey(h)){
                int temp = map.get(h)+root.val;
                map.put(h,temp);
            }
            else{
                map.put(h,root.val);
            }
            fun(root.left,h+1);
            fun(root.right,h+1);
    }
    public int maxLevelSum(TreeNode root) {
        fun(root,1);
         int max =Integer.MIN_VALUE;
         int index=0;
         System.out.println(map);
        for(int i=1;i<=map.size();i++){
            if(max < map.get(i)){
                max=map.get(i);
                index=i;
            }
        }
        return index;
    }
}