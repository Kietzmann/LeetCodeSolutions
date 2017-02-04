package edu.kytsmen.leetcode.algorithms;

/**
 * Created by dmytro on 04.02.17.
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = head;
        ListNode p = head.next;

        while (p != null) {
            if (p.val == prev.val) {
                prev.next = p.next;
                p = p.next;
                //no change prev
            } else {
                prev = p;
                p = p.next;
            }
        }

        return head;
    }
}
