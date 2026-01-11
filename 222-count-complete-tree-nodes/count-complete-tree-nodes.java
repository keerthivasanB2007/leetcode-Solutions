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
    int r=0;
    void inorder(TreeNode root){
        if(root==null)
           return;
        inorder(root.left);
        r++;
        inorder(root.right);
    }
    public int countNodes(TreeNode root) {
        inorder(root);
        return r;
    }
}