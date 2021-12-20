package tencent_top_50;

public class T2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode head = res;
        int x = 0;
        int num1 , num2;
        while (l1!=null || l2!=null){
            if (l1!=null)
                 num1 = l1.val;
            else
                num1 = 0;
            if (l2!=null)
               num2 = l2.val;
            else
                num2 = 0;
            res.next = new ListNode((num1 + num2 + x)%10);
            x = (num1 + num2 + x) / 10;
            res = res.next;
            if (l1!=null)
                l1 = l1.next;
            if (l2!=null)
                l2 = l2.next;
        }
        if (x!=0)
            res.next = new ListNode(1);
        return head.next;
    }
}
