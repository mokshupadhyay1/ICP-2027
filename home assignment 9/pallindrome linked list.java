class Solution {
    public boolean isPalindrome(ListNode head) {
         if (head==null || head.next==null) return true;
        ListNode slow=head, fast=head;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev= null, curr=slow;
        while (curr!=null) {
            ListNode nextTemp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextTemp;
        }
        ListNode temp1=head, temp2=prev;
        while (temp2!=null) {
            if (temp1.val!=temp2.val) {
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
    }
}
