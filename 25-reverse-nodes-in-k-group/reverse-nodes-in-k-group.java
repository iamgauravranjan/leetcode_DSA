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

    ListNode rev(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp=head;
        int size=0;
    
        while(temp!=null){
            temp=temp.next;
            size++;
        }

        int a=size/k;
        ListNode prevGroupTail = null;
        ListNode newHead = null;


            for(int i=0;i<a;i++){

                 ListNode prev=head;
                 ListNode curr=head;
                

                for(int j=1;j<k;j++){
                    curr=curr.next;
                   
                }
                ListNode next=curr.next;
                curr.next=null;
                ListNode t=rev(prev);
                 if (newHead == null) {
                newHead = t;
            }

                 if (prevGroupTail != null) {
                prevGroupTail.next = t;
            }

                  prevGroupTail = prev;

                  head = next;
            }
             if (prevGroupTail != null) {
            prevGroupTail.next = head;
        }
        
          return newHead;
    }
}