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
    public static void mergeSort(List<Integer> arr, int left, int right) {

        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
        
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    
    }

    public static void merge(List<Integer> arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
       
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr.get(left+i);
        for (int j = 0; j < n2; j++)
            R[j] = arr.get(mid + 1 + j);

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
               arr.set(k,L[i]);
                i++;
            } else {
                arr.set(k,R[j]);
                j++;
            }
            k++;
        }

        while (i < n1) {
             arr.set(k,L[i]);
            i++;
            k++;
        }

        while (j < n2) {
            arr.set(k,R[j]);
             j++;
            k++;
        }

   
    }
    public ListNode mergeKLists(ListNode[] lists) {
          
        List<Integer> x=new ArrayList<>();
    
         for(int i=0;i<lists.length;i++){
             while( lists[i]!=null){
                x.add(lists[i].val);
                lists[i]=lists[i].next;
            
            }
         }
            
            ListNode r=new ListNode(-1);  
            ListNode r1=r;
              mergeSort(x,0,x.size()-1);
       for(Integer y:x){
         r.next=new ListNode(y);
         r=r.next;
       }
       x.clear();
        return r1.next;
    }
}