package edu.kytsmen.leetcode.algorithms;

/**
 * Created by dmytro on 05.02.17.
 */
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = 0;
        int len2 = 0;
        ListNode p1 = headA, p2 = headB;
        if (p1 == null || p2 == null)
            return null;

        while (p1 != null) {
            len1++;
            p1 = p1.next;
        }
        while (p2 != null) {
            len2++;
            p2 = p2.next;
        }

        int diff = 0;
        p1 = headA;
        p2 = headB;

        if (len1 > len2) {
            diff = len1 - len2;
            int i = 0;
            while (i < diff) {
                p1 = p1.next;
                i++;
            }
        } else {
            diff = len2 - len1;
            int i = 0;
            while (i < diff) {
                p2 = p2.next;
                i++;
            }
        }

        while (p1 != null && p2 != null) {
            if (p1.val == p2.val) {
                return p1;
            } else {

            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return null;
    }

    public int getLength(ListNode head) {
        int counter = 0;
        while (head != null) {
            counter++;
        }
        return counter;
    }
}
