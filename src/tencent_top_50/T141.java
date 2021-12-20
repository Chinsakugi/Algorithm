package tencent_top_50;


import java.util.List;

public class T141 {
    public boolean hasCycle(ListNode head) {
        if (head==null || head.next==null)
            return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast!=slow){
            if (fast==null||fast.next==null)
                return false;
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}
