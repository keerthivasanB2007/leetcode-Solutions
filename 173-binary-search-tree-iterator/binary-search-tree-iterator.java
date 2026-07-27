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
class BSTIterator {
     List<Integer> l = new ArrayList<>();
     int pointer = 1;
     public void inOrder(TreeNode root){
        if(root==null)
           return;

        inOrder(root.left);
        l.add(root.val);
        inOrder(root.right);
     }
    public BSTIterator(TreeNode root) {
        l.add(Integer.MIN_VALUE);
        inOrder(root);
        System.out.println(l);
    }
    
    public int next() {
        if(pointer==0)
           pointer++;
        return l.get(pointer++);
    }
    
    public boolean hasNext() {
        if( (pointer)<(l.size()) ){

         System.out.println(pointer);
            return true;
        }
        else{
          
            return false;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */