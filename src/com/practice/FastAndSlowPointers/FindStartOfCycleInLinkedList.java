package com.practice.FastAndSlowPointers;

public class FindStartOfCycleInLinkedList {

    public static LinkedListNode findStart(LinkedListNode head){
        int length = LengthOfCycleInLinkedList.findLength(head);

        LinkedListNode l1 = head;
        LinkedListNode l2 = head;

        while (length>0){
            l2 = l2.next;
            length--;
        }

        while (l1 != l2){
            l1 = l1.next;
            l2 = l2.next;
        }

        return l2;
    }
}
