class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode current;
        current = head;
        while (current.next!=null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            }
            current = current.next;
        }
        return head;
    }
}


