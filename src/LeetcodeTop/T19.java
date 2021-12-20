package LeetcodeTop;

public class T19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head;
        if (head.next==null)
            return null;
        ListNode pre = null;
        for (int i = 0;i<n-1;++i)
            fast = fast.next;
        while (fast.next!=null){
            fast = fast.next;
            pre = slow;
            slow = slow.next;
        }
        if (pre!=null)
            pre.next = slow.next;
        else
            head = head.next;
        return head;
    }
}
