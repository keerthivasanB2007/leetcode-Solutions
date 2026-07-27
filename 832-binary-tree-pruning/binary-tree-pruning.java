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
        public boolean p(TreeNode root){
            if(root == null)
               return false;
            
            boolean lift = p(root.left);
            boolean right = p(root.right);

            if(lift == false)
               root.left= null;
            if(right == false)
               root.right=null;
            
            if(root.val ==1)
               return true || lift || right;
            else
               return false || lift || right;
        }
    public TreeNode pruneTree(TreeNode root) {
        boolean result = p(root);
        if(!result)
          {
            root=null;
            return root;
          }
          else
            return root;
    }
}