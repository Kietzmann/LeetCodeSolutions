package edu.kytsmen.leetcode.algorithms;

/**
 * Created by dmytro on 05.02.17.
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode p = head;
        ListNode prev = new ListNode(head.val);

        while (p.next != null) {
            ListNode temp = new ListNode(p.next.val);
            temp.next = prev;
            prev = temp;
            p = p.next;
        }

        return prev;
    }
}
