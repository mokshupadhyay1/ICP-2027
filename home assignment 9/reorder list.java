class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next; 
            slow = slow.next;
        }
        ListNode second = slow.next;
        slow.next = null;
        // Reverse second half of the linked list
        ListNode prev = null;
        while (second != null){
            ListNode curr = second.next;
            second.next = prev;
            prev = second;
            second = curr;
        }
        ListNode first = head;
        second = prev;
        while (second != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }
}
