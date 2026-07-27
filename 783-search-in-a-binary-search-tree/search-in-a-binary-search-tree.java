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
    public TreeNode findBST(TreeNode root,int val){
        if(root==null)
          return null;

        if(root.val == val){
            return root;
        }
        else if(val < root.val){
            return findBST(root.left,val);
        }
        else{
            return findBST(root.right,val);
        }
        
    }
    public TreeNode searchBST(TreeNode root, int val) {
         return findBST(root,val);   
    }
}