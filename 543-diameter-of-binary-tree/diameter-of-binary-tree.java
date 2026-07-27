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
    int max=0;
    public int findMaxPath(TreeNode root){

        if(root==null)
          return 0;

        int leftHeight = findMaxPath(root.left);
        int rightHeight = findMaxPath(root.right);
          max=max>(leftHeight +rightHeight)?max:(leftHeight+rightHeight);
        return 1+Math.max(leftHeight,rightHeight);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        System.out.println(findMaxPath(root));
        return max;
    }
}