package tencent_top_50;

import java.util.List;

public class T61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null||k==0)
            return head;
        int nodeNum = 0;
        ListNode tempHead = head;
        while (tempHead!=null){
            tempHead = tempHead.next;
            ++nodeNum;
        }
        int p = k % nodeNum ;
        if (nodeNum==1||p==0)
            return head;
        ListNode cur = head;
        ListNode oldHead = head;
        int i = 0;
        while (i < p){
            cur = cur.next;
            ++i;
        }
        while (cur.next!=null){
            cur = cur.next;
            head = head.next;
        }
        ListNode newHead = head.next;
        head.next = null;
        cur.next = oldHead;
        return newHead;
    }
}
