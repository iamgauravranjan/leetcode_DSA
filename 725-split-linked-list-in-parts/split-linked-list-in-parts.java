class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {

        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        ListNode[] l = new ListNode[k];

        int ans = size / k;
        int rem = size % k;

        temp = head;

        for (int i = 0; i < k; i++) {

            l[i] = temp;

            
            int partSize = ans;

            if (rem > 0) {
                partSize++;
                rem--;
            }

          
            for (int j = 1; j < partSize; j++) {
                temp = temp.next;
            }

           
            if (temp != null) {
                ListNode next = temp.next;

               
                temp.next = null;

                temp = next;
            }
        }

        return l;
    }
}