/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode r=new ListNode(-1);
        ListNode x=r;
        int []g = new int[k];
         int i=0;
         while(head!=null){

        while(i<k && head!=null){
            g[i]=head.val;
            head=head.next;
            i++;
        }
      
       if(i==k){
       for(int j=i-1;j>=0;j--){
        r.next=new ListNode(g[j]);
        r=r.next;
       
       }
       }
       else{
         for(int j=0;j<i;j++){
        r.next=new ListNode(g[j]);
        r=r.next;
     
       }
       }
        i=0;
        Arrays.fill(g,0);
    }
      return x.next;   
    }
}