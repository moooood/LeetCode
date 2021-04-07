/**
 * @author hongguan.liu
 * Created at: 2021/3/2
 **/

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){val = x;}
}

public class MyLinkedList {
    int size;
    ListNode dummyHead;

    /** Initialize your data structure here. */
    public MyLinkedList() {

        dummyHead = new ListNode(0);
        size = 0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index > size-1 || index < 0)
            return -1;

        ListNode cur = dummyHead.next;
        while (index-- != 0){
            cur = cur.next;
        }
        return cur.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode newHead = new ListNode(val);
        newHead.next = dummyHead.next;
        dummyHead.next = newHead;
        size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode prev = dummyHead;

        while (null != prev.next) {
            prev = prev.next;
        }

        ListNode newNode = new ListNode(val);
        prev.next = newNode;
        size++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index > size)
            return;

        ListNode prev = dummyHead;
        ListNode newNode = new ListNode(val);

        while (index-- != 0){
            prev = prev.next;
        }

        newNode.next = prev.next;
        prev.next = newNode;
        size++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size)
            return;

        ListNode prev = dummyHead;

        while (index-- != 0){
            prev = prev.next;
        }

        prev.next = prev.next.next;
        size--;

    }
}
