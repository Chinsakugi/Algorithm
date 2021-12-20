package leetcode周赛.Day1029;

public class T01 {
    public ListNode deleteListNode(ListNode head) {
        if (head.next==null)
            return head;
        ListNode cur = head;
        while (cur!=null&&cur.next!=null){
            cur.next = cur.next.next;
            cur = cur.next;
        }
        return head;
    }
}
