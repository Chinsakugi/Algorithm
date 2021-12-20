package mianShiJingDian;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class T02_01 {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head==null)
            return head;
        ListNode newHead = new ListNode(1);
        ListNode cur = newHead;
        HashSet set = new HashSet<Integer>();
        cur.next = new ListNode(head.val);
        cur = cur.next;
        set.add(head.val);
        while (head!=null){
            if (!set.contains(head.val)){
                set.add(head.val);
                cur.next = new ListNode(head.val);
                cur = cur.next;
            }
            head = head.next;
        }
        return newHead.next;
    }
}
