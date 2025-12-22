/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        int sum=0,carry=0;
        ListNode* r=new ListNode(0);
        ListNode* m=r;
        while(l1!=nullptr || l2!=nullptr){
            int a=0,b=0;
            if(l1!=nullptr){
                a=l1->val;
                l1=l1->next;
            }
            if(l2!=nullptr){
                b=l2->val;
                l2=l2->next;
            }
                
            sum=a+ b+carry;
            carry=sum/10;
            sum=sum%10;
            m->next=new ListNode(sum);
             m=m->next;
        
            
        }
        if(carry!=0)
            m->next=new ListNode(carry);
        return r->next;
            
    }
};