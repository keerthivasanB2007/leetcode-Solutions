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
   boolean result=true;
     int findHeight(TreeNode root){
        if(root==null)
           return 0;
    
        int l=findHeight(root.left);
       
        int r=findHeight(root.right);
 
        if((Math.abs(l-r)>1 )){
           result=false;
           return 0;
        }
        // else
        // {
        //     result=false;
        
        // }
        
        return 1+Math.max(l,r);

    }
    public boolean isBalanced(TreeNode root) {
       
        if(root==null || (root.left==null && root.right==null))
           return true;
        int res=findHeight(root);
        return result;
       
    }
}