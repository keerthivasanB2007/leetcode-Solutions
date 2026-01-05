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
    ListNode* removeElements(ListNode* head, int val) {
        ListNode* d=new ListNode(-999);
        d->next=head;
        ListNode* r=d;
        while(r->next!=nullptr){
             if(r->next->val == val)
                {
                    r->next=r->next->next;
                   
                }
                 
                 else
                r=r->next;
        }
        return d->next;
    }
};