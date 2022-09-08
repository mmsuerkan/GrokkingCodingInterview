package org.fastSlowPointer.challenge1;

public class LinkedListCycle {
    private static boolean hasCycle(LinkedListCycleLength.ListNode head) {
        LinkedListCycleLength.ListNode slow = head,fast = head;


        while (fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LinkedListCycleLength.ListNode head = new LinkedListCycleLength.ListNode(1);
        head.next = new LinkedListCycleLength.ListNode(2);
        head.next.next = new LinkedListCycleLength.ListNode(3);
        head.next.next.next = new LinkedListCycleLength.ListNode(4);
        head.next.next.next.next = new LinkedListCycleLength.ListNode(5);
        head.next.next.next.next.next = new LinkedListCycleLength.ListNode(6);
        System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));

        head.next.next.next.next.next.next = head.next.next;
        System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));

        head.next.next.next.next.next.next = head.next.next.next;
        System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));
    }



}
