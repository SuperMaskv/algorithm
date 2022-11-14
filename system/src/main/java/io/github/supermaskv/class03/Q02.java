package io.github.supermaskv.class03;

import io.github.supermaskv.utils.BiLinkedList;

/**
 * @author supermaskv
 * <p>
 * 反转双向链表
 */
public class Q02 {
    private static BiLinkedList.ListNode reverse(BiLinkedList.ListNode head) {
        if (head == null || head.next == null) return head;

        BiLinkedList.ListNode pre = null;
        BiLinkedList.ListNode cur = head;
        BiLinkedList.ListNode next = head.next;
        while (cur != null) {
            cur.pre = next;
            cur.next = pre;
            pre = cur;
            cur = next;
            next = cur != null ? cur.next : null;
        }

        return pre;
    }

    public static void main(String[] args) {
        BiLinkedList.print(reverse(BiLinkedList.generate(new int[]{1, 2, 3, 4, 5})));
        BiLinkedList.reversePrint(reverse(BiLinkedList.generate(new int[]{1, 2, 3, 4, 5})));
    }
}

