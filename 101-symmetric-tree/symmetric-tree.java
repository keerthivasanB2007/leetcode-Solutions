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
    boolean symmetric(TreeNode Right,TreeNode Left){
           if(Right==null &&  Left==null)
            return true;
            if(Right==null || Left==null)
                return false;
        if(Right.val!=Left.val)
             return false;

       return  symmetric(Right.right,Left.left) && symmetric(Right.left,Left.right);
    }
    public boolean isSymmetric(TreeNode root) {
              return symmetric(root.right,root.left);
    }
}