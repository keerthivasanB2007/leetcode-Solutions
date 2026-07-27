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
    HashMap<Integer,List<Integer>> map= new HashMap<>();
        public void find(TreeNode root,int d){
                if(root == null)
                   return;
                if(map.containsKey(d)){
                  
                   map.get(d).add(root.val);
                }
                else{
                 
                  List<Integer> temp = new ArrayList<>();
                  temp.add(root.val);
                    map.put(d,temp);
                }
                find(root.left,d+1);
                find(root.right,d+1);
        }
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)
          return new ArrayList<>();
        find(root,0);
     
        List<List<Integer>> result = new ArrayList<>(map.values());

        return result; 
    }
}