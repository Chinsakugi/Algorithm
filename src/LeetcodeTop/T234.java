package LeetcodeTop;

public class T234 {
    ListNode front;
    public boolean isPalindrome(ListNode head) {
        this.front = head;
        return recur(head);
    }

    public boolean recur(ListNode head){
        if (head!=null){
            if (!recur(head.next))
                return false;
            if (head.val!=front.val)
                return false;
            front = front.next;
        }
        return true;
    }

}
