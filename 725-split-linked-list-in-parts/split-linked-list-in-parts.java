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

            // Number of nodes in this part
            int partSize = ans;

            if (rem > 0) {
                partSize++;
                rem--;
            }

            // Move to the last node of this part
            for (int j = 1; j < partSize; j++) {
                temp = temp.next;
            }

            // Save next part
            if (temp != null) {
                ListNode next = temp.next;

                // Break current part
                temp.next = null;

                temp = next;
            }
        }

        return l;
    }
}