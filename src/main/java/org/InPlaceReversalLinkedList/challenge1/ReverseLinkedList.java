package org.InPlaceReversalLinkedList.challenge1;

class ListNode {
    int value = 0;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
}

public class ReverseLinkedList {

    public static ListNode reverse(ListNode head) {

        ListNode prev = null,current = head,next = null;


        while (current!= null) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }


        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(10);


        ListNode result = ReverseLinkedList.reverse(head);
        System.out.println("Nodes of the reversed LinkedList are: ");
        while (result != null) {
            System.out.print(result.value + " ");
            result = result.next;
        }
    }

}
