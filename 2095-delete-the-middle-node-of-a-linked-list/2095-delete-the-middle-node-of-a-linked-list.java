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
    public ListNode deleteMiddle(ListNode head) {

        if(head.next == null || head == null) return null;
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        int mid = count/2;
        temp = head;
        for(int i = 0; i < mid-1; i++){
            temp = temp.next;
        }
        if(temp != null && temp.next != null){ 
            temp.next = temp.next.next;
        }
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna