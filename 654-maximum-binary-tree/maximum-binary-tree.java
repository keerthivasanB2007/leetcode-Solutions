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

    public TreeNode constructTree(int l,int r,int[] nums){
        if(l>r)
            {
                return null;
             
            }
        int m = nums[l];
        int index=l;
        for(int i=l;i<=r;i++){
            if(nums[i]>m){
                m=nums[i];
                index=i;
            }
        }
        TreeNode root = new TreeNode(nums[index]);
       
        root.left = constructTree(l,index-1,nums);
        root.right =  constructTree(index+1,r,nums);
        return root;
       

    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        
        return constructTree(0,nums.length-1,nums);
    }
}