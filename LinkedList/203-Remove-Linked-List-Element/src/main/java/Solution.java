/**
 * @author hongguan.liu
 * Created at: 2021/3/2
 **/
public class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode prev = dummyHead;

        while (null != prev.next){
            if(prev.next.val == val){
                prev.next = prev.next.next;
            }else{
                prev = prev.next;
            }
        }
        return dummyHead.next;
    }

    public static void main(String[] args){
        ListNode h = new ListNode(1);
        System.out.println(new Solution().removeElements(h, 1));
    }
}
