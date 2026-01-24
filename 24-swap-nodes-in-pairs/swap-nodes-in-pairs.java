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
    public ListNode swapPairs(ListNode head) {
          if(head==null)
          return head;
        ListNode r=head;
        ListNode f=head;
      
        ListNode s=head.next;
        while(f!=null && s!=null){
            int t=f.val;
            f.val=s.val;
            s.val=t;
            f=s.next;
            if(f==null)
               break;
            s=f.next;
        }
        return r;
    }
}