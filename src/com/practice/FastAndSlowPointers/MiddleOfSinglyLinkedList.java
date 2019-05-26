package com.practice.FastAndSlowPointers;

public class MiddleOfSinglyLinkedList {

    public static LinkedListNode findMiddle(LinkedListNode head){

        LinkedListNode fastRunner = head;
        LinkedListNode slowRunner =head;

        while (fastRunner!=null && fastRunner.next !=null){
            slowRunner = slowRunner.next;
            fastRunner=fastRunner.next.next;

            if(slowRunner == fastRunner){
                break;
            }

        }

        return slowRunner;
    }
}
