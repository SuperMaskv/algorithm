package io.github.supermaskv.class03;

import io.github.supermaskv.utils.LinkedList;

/**
 * @author supermaskv
 * <p>
 * 反转单向链表
 */
public class Q01 {

    private static LinkedList.ListNode reverse(LinkedList.ListNode head) {
        if (head == null || head.next == null) return head;

        LinkedList.ListNode pre = null;
        LinkedList.ListNode cur = head;
        while (cur != null) {
            LinkedList.ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        return pre;
    }

    public static void main(String[] args) {
        LinkedList.print(reverse(LinkedList.generate(new int[]{1, 2, 3, 4, 5, 6, 7, 8})));
    }
}
