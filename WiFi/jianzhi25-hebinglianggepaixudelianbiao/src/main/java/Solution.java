/**
 * @author hongguan.liu
 * Created at: 2021/3/18
 **/
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode tmp = new ListNode(0);
        ListNode cur = tmp;

        while (null != l1 && null != l2){
            if (l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = (null == l1) ? l2 : l1;

        return tmp.next;
    }
}
