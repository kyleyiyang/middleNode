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
    public ListNode middleNode(ListNode head) {
        ListNode x = head;
        int n=0;
        while (head.next!=null) {
            n++;
            head=head.next;
        }
        int count=0;
        if (n%2==0) {
            count=n/2;
        } else {
            count =(int)Math.ceil(n/2+1);
        }
        int m=0;
        while (x.next!=null && m<count) {
            m++;
            x=x.next;
        }
        return x;
    }
}
