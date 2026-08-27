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
    public ListNode mergeNodes(ListNode head) {

        ListNode temp=head.next;
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        int sum=0;

        while(temp!=null){

            if(temp.val==0){

                temp.val=sum;
                t.next=temp;
                t=t.next;
                sum=0;
                temp=temp.next;
                continue;

            }
            else{
                sum+=temp.val;


            }
            temp=temp.next;
            

        }

        return dummy.next;


        
    }
}