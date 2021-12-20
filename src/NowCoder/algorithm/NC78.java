package NowCoder.algorithm;

public class NC78 {
    public ListNode ReverseList(ListNode head) {
        if (head==null)
            return null;
        ListNode pre = null;
        ListNode cur = head;
        ListNode nextNode = head;
        while (cur!=null){
            nextNode = nextNode.next;
            cur.next = pre;
            pre = cur;
            cur = nextNode;
        }
        return pre;
    }
}
