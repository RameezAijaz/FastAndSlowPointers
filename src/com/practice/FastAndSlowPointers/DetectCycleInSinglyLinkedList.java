package com.practice.FastAndSlowPointers;

public class DetectCycleInSinglyLinkedList {

    public static boolean hasCycle(LinkedListNode head){

        if(head == null || head.next == null || head.next.next == null)
            return false;

        LinkedListNode slowRunner = head;
        LinkedListNode fastRunner = head.next.next;

        while (true){

            if(fastRunner == slowRunner)
                return true;

            if(fastRunner.next == null || fastRunner.next.next == null)
                break;

            fastRunner = fastRunner.next.next;
            slowRunner = slowRunner.next;

        }


        return false;

    }
}
