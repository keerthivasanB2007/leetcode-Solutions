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
    // public String printString(TreeNode root){
    //         if(root==null)
    //            return "";
            
    //         String left = printString(root.left);
    //         String right = printString(root.right);
            
    //         if(left.length()==0 && right.length()==0)
    //             return root.val+"";
    //         else if(left.length()==0 && right.length()!=0)
    //             return root.val + "()(" + right + ")";
    //         else if(left.length()!=0 && right.length()!=0)
    //             return root.val + "(" + left+ ")" + "(" + right + ")";
    //         else
    //             return root.val +"(" +left +")";
        
    // }
    public void printString(TreeNode root, StringBuilder a){
        if(root==null)
          return;
        
        a.append(root.val);

        if(root.left!=null || root.right!=null){
            a.append("(");
            printString(root.left,a);
            a.append(")");
        }
        if(root.right!=null){
            a.append("(");
            printString(root.right,a);
            a.append(")");
        }
    }
    public String tree2str(TreeNode root) {
        StringBuilder a = new StringBuilder();
        printString(root,a);
        
        return a.toString();
    }
}