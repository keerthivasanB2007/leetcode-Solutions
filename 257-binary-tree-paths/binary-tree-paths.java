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
    List<String> result = new ArrayList<>();
    public void findPath(TreeNode root,String s){
         if(root==null)
           return;
            if(root!=null && root.left==null && root.right==null){
                if(s=="")
                s=s+root.val;
               else
                s=s+"->"+root.val;
                result.add(s);
                return;
            }
            if(s=="")
               s=s+root.val;
            else
                s=s+"->"+root.val;
            findPath(root.left,s);
            findPath(root.right,s);
    }
    public List<String> binaryTreePaths(TreeNode root) {
          findPath(root,"");  
          return result; 
    }
}