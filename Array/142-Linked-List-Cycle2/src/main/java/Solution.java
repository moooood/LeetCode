/**
 * @author hongguan.liu
 * Created at: 2021/3/2
 **/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (null != fast && null != fast.next){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                ListNode temp = head;
                while(temp != fast){
                    temp = temp.next;
                    fast = fast.next;
                }
                return fast;
            }
        }
        return null;
    }
}
