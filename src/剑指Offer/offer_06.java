package 剑指Offer;

import java.util.LinkedList;
import java.util.List;

public class offer_06 {
    List<Integer> list = new LinkedList();
    public int[] reversePrint(ListNode head) {
        recur(head);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public void recur(ListNode head){
        if (head==null)
            return;
        recur(head.next);
        list.add(head.val);
    }
}
