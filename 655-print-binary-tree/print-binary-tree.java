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

    public List<List<String>> printTree(TreeNode root) {
        List<List<String>> ans = new ArrayList<>();
        int h = height(root);
       // System.out.println(h);
        int e = (int)Math.pow(2, h) - 1;
       // System.out.println(e);
        for(int i = 0; i < h; i++){
            List<String> row = new ArrayList<>();
            for(int j = 0; j < e; j++){
                row.add("");

            }
            ans.add(row);
        }
        find(0, root, 0, e-1, ans, h-1 );

        return ans;
    }
    private void find(int level, TreeNode node, int i, int j,  List<List<String>> arr, int height){
        if (node == null){
            return;
        }
        int space = (int)Math.pow(2, height) - 1;
        arr.get(level).set(i + space, node.val + "");
       
        find(level+1, node.left, i, space - 1, arr, height-1);
        find(level+1, node.right, i+space+1, j, arr, height-1);
    }
    private int height(TreeNode node){
        if(node == null){
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }
}