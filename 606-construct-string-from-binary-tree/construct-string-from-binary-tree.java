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
    public String printString(TreeNode root){
            if(root==null)
               return "";
            
            String left = printString(root.left);
            String right = printString(root.right);
            System.out.println("root : "+root.val);
            System.out.println("left : "+left);
            System.out.println("right : "+right);
            if(left.length()==0 && right.length()==0)
                return root.val+"";
            else if(left.length()==0 && right.length()!=0)
                return root.val + "()(" + right + ")";
            else if(left.length()!=0 && right.length()!=0)
                return root.val + "(" + left+ ")" + "(" + right + ")";
            else
                return root.val +"(" +left +")";
          //  return root.val + "(" + printString(root.left) + ")" + "(" + printString(root.right) + ")";
    }
    public String tree2str(TreeNode root) {
        String result = printString(root);
        return result;
    }
}