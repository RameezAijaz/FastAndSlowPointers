package com.practice.fastAndSlowPointers;

public class SinglyLinkedListIsPalindrome {

    public static boolean isPalindrome(LinkedListNode head){
        LinkedListNode middle = MiddleOfSinglyLinkedList.findMiddle(head);
        LinkedListNode halfReverse = reverse(middle);

        LinkedListNode l1 = head;
        LinkedListNode l2 = halfReverse;

        while (l1 != null && l2 !=null){
            if(l1.value != l2.value)
                break;
            l1 = l1.next;
            l2 = l2.next;
        }
        middle.next = reverse(halfReverse).next;
        return l1 == null && l2 == null;
    }

    public static LinkedListNode reverse(LinkedListNode head){

        LinkedListNode prev = null;
        while (head != null){
            LinkedListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
