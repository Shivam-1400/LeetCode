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
    ListNode* deleteMiddle(ListNode* head) {
        ListNode *temp = head;
        int count = 0;
        while(temp != NULL){
            temp = temp->next;
            count++;
        }
        int x = count/2;
        ListNode *temp2 = head;
        if(count%2 ==0){
            while(x >1){
                temp2 = temp2->next;
                x--;
            }
        }else{
            while(x>1){
                temp2 = temp2->next;
                x--;
            }
        }
        // ListNode *temp3=head;
        // while(temp3->val != temp2->val){
        //     temp3 = temp3->next;
        // }
        if(temp2->next== NULL){
            return NULL;
        }
        temp2->next = temp2->next->next;
        return head;
    }
};