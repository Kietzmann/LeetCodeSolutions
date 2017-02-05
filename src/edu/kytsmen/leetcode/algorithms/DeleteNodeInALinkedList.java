package edu.kytsmen.leetcode.algorithms;

/**
 * Created by dmytro on 05.02.17.
 */
public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
