package com.practice.fastAndSlowPointers;

public class Main {

    public static void main(String[] args) {
	// write your code here

    /*    Given the head of a Singly LinkedList, write a function to determine
        if the LinkedList has a cycle in it or not.*/

    LinkedListNode linkedListNode = new LinkedListNode(1);
    linkedListNode.next  = new LinkedListNode(2);
    linkedListNode.next.next  = new LinkedListNode(3);
    linkedListNode.next.next.next  = new LinkedListNode(4);
    linkedListNode.next.next.next.next  = new LinkedListNode(5);
    linkedListNode.next.next.next.next.next  = new LinkedListNode(6);
    linkedListNode.next.next.next.next.next.next  = linkedListNode.next.next;


    boolean hasCycle = DetectCycleInSinglyLinkedList.hasCycle(linkedListNode);
    System.out.println("LINKEDLIST 1->2->3->4->5->6->3 HAS CYCLE?" );
    System.out.println(hasCycle);

 /*   Given the head of a LinkedList with a cycle,
                find the length of the cycle.*/

    int length = LengthOfCycleInLinkedList.findLength(linkedListNode);
    System.out.println("LINKEDLIST 1->2->3->4->5->6->3 HAS CYCLE OF LENGTH "+ length );

/*
    Given the head of a Singly LinkedList that contains a cycle,
                write a function to find the starting node of the cycle.*/

    LinkedListNode cycleStart = FindStartOfCycleInLinkedList.findStart(linkedListNode);

    System.out.println("IN LINKEDLIST 1->2->3->4->5->6->3 CYCLE STARTS FROM "+ cycleStart.value);

/*      Any number will be called a happy number if, after repeatedly replacing it with a number equal to the sum of the square of all of its digits, leads us to number ‘1’. All other (not-happy) numbers will never reach ‘1’. Instead, they will be stuck in a cycle of numbers which does not include ‘1’.

        Example 1:

        Input: 23
        Output: true (23 is a happy number)
        Explanations: Here are the steps to find out that 23 is a happy number:
        2^2 + 3^2 = 4 + 9 = 13
        1^2 + 3^2 = 1+9 = 10
        1^2 + 0^2 = 1+0 = 0


        */

        int num = 23;

        boolean isHappy = FindIfNumberIsHappyNumber.isHappy(num);

        System.out.println("IF "+ num+ " IS A HAPPY NUMBER ?");
        System.out.println(isHappy);


       /* Given the head of a Singly LinkedList, write a method to return the middle node of the LinkedList.

                If the total number of nodes in the LinkedList is even, return the second middle node.

                Example 1:

        Input: 1 -> 2 -> 3 -> 4 -> 5 -> null
        Output: 3*/

       linkedListNode = new LinkedListNode(1);
        linkedListNode.next  = new LinkedListNode(2);
        linkedListNode.next.next  = new LinkedListNode(3);
        linkedListNode.next.next.next  = new LinkedListNode(4);
        linkedListNode.next.next.next.next  = new LinkedListNode(5);

       LinkedListNode middleNode = MiddleOfSinglyLinkedList.findMiddle(linkedListNode);

        System.out.println("MIDDLE OF LINKEDLIST 1->2->3->4->5 IS");
        System.out.println(middleNode.value);


        /*
        Given the head of a Singly LinkedList, write a method to check if the LinkedList is a palindrome or not.

        Your algorithm should use constant space and the input LinkedList should be in the original form once the algorithm is finished. The algorithm should have O(N)O(N) time complexity where ‘N’ is the number of nodes in the LinkedList.

        Example 1:

        Input: 2 -> 4 -> 6 -> 4 -> 2 -> null
        Output: true*/

        linkedListNode = new LinkedListNode(2);
        linkedListNode.next  = new LinkedListNode(4);
        linkedListNode.next.next  = new LinkedListNode(6);
        linkedListNode.next.next.next  = new LinkedListNode(4);
        linkedListNode.next.next.next.next  = new LinkedListNode(2);
        linkedListNode.next.next.next.next.next  = new LinkedListNode(2);

        boolean isPalindrome = SinglyLinkedListIsPalindrome.isPalindrome(linkedListNode);
        System.out.println("LINKEDLIST 2->4->6->4->2 IS PALINDROME ?");
        System.out.println(isPalindrome);
    }
}
