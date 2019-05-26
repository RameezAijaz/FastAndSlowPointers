package com.practice.FastAndSlowPointers;

public class LengthOfCycleInLinkedList {

    public static int findLength(LinkedListNode head){

        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while (fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                return calculateLength(fast);
            }

        }

        return -1;

    }

    private static int calculateLength(LinkedListNode fast) {
        LinkedListNode tmp = fast.next;
        int distance = 1;

        while (tmp != fast){
            tmp = tmp.next;
            distance++;
        }

        return distance;
    }
}
