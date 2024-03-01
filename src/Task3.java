public class Task3 {
    public void runner(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println("original linked list");
        printLinkedList(head);
        System.out.println("reversed linked list");
        printLinkedList(reverseList(head));

    }

    public ListNode reverseList(ListNode head){
        ListNode curr = head, prev = null, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public void printLinkedList(ListNode head){
        ListNode curr = head;
        while (curr != null) {
            if (curr.next != null)
                System.out.print(curr.val + "->");
            else System.out.println(curr.val);
            curr = curr.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { this.val = x; }
}
