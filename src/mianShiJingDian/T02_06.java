package mianShiJingDian;

public class T02_06 {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode pre = null;
        while (slow!=null){
            ListNode next = slow.next;
            slow.next = pre;
            pre = slow;
            slow = next;
        }
        ListNode node = head;
        while (pre!=null){
            if (pre.val!= node.val)
                return false;
            pre = pre.next;
            node = node.next;
        }
        return true;
    }
}
