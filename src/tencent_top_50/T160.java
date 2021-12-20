package tencent_top_50;

public class T160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        while (p!=q){
            p = p.next;
            q = q.next;
            if (p==null&& q==null)
                return null;
            if (p==null)
                p = headB;
            if (q == null)
                q = headA;
        }
        return p;
    }
}
