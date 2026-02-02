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
    public ListNode sortList(ListNode head) {
        List<Integer> l=new ArrayList<>();
        while(head!=null){
            l.add(head.val);
            head=head.next;
        }
        ListNode r=new ListNode(-1);
        ListNode r1=r;
         Collections.sort(l);
        Iterator<Integer> i=l.iterator();
        while(i.hasNext()){
            r.next=new ListNode(i.next());
            r=r.next;
        }
        
        return r1.next;
        
    }
}