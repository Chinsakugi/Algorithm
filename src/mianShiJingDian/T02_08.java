package mianShiJingDian;

public class T02_08 {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast)
                break;
        }
        if (fast.next==null || fast.next.next==null)
            return null;
        ListNode cur = head;
        while (cur!=slow){
            cur = cur.next;
            slow = slow.next;
        }
        return cur;
    }
}
