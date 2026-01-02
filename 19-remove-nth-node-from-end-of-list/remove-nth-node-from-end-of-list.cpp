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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
           ListNode* t=nullptr;
           while(head!=nullptr){
            ListNode* newnode=new ListNode(head->val);
            newnode->next=t;
            t=newnode;
            head=head->next;
           }
           ListNode* h=t;
           ListNode* prev=nullptr;
           while(n>1){
                prev=h;
                h=h->next;
                n--;
           }
          if(prev == nullptr){
        t = h->next;   
    } else {
        prev->next = h->next;
    }
    ListNode* res = nullptr;
    while(t != nullptr){
        ListNode* newnode = new ListNode(t->val);
        newnode->next = res;
        res = newnode;
        t = t->next;
    }
    return res;
    }
};