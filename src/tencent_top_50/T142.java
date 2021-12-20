package tencent_top_50;

public class T142 {
    public ListNode detectCycle(ListNode head) {
        if (head==null)
            return null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null){
            slow = slow.next;
            if (fast.next!=null)
                fast = fast.next.next;
            else
                return null;
            if (fast==slow){
                ListNode ptr = head;
                while (ptr!=slow){
                    ptr = ptr.next;
                    slow= slow.next;
                }
                return ptr;
            }
        }
        return null;
    }
}
