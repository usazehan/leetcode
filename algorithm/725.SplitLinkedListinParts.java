/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] res = new ListNode[k];
        int count = 0;
        ListNode cur = root;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        cur = root;
        int size = count / k; 
        int rem = count % k; 
        for (int i = 0; i < k && cur != null; i++) {
            res[i] = cur;
            for (int j = 0; j < size + (rem > 0 ? 1 : 0) - 1; j++) {
                cur = cur.next;
            }
             
            ListNode temp = cur.next;
            cur.next = null;
            cur = temp;
            rem--;
        }
        return res;
    }
}
