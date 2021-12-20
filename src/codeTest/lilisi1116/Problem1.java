package codeTest.lilisi1116;

public class Problem1 {
    public ListNode formatList (ListNode head) {
        ListNode left = head;
        ListNode right = head;
        if (head.next == null)
            return head;
        head = head.next;
        int index = 1;
        while (head!=null){
            if (index%2!=0){
                right.next = new ListNode(head.val);
                right = right.next;
            }else {
                ListNode temp = left;
                ListNode cur = new ListNode(head.val);
                cur.next = temp;
                left = cur;
            }
            ++index;
            head = head.next;
        }
        return left;
    }
}
