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
    ListNode* deleteDuplicates(ListNode* head) {
            ListNode* r=new ListNode(-1);
            ListNode* g=r;
            int now=-101;
            while(head!=nullptr){
                if(head->val!=now){

                    now=head->val;
                    r->next=new ListNode(now);
                    r=r->next;
                }
                head=head->next;
            }   
            return g->next;
    }
};