package io.github.supermaskv.class03;

import io.github.supermaskv.utils.LinkedList;

/**
 * @author supermaskv
 * <p>
 * 删除链表中所有等于目标值的节点
 */
public class Q03 {
    private static LinkedList.ListNode delete(LinkedList.ListNode head, int target) {
        if (head == null) return head;

        LinkedList.ListNode cur = new LinkedList.ListNode();
        cur.next = head;
        head = cur;
        while (cur.next != null) {
            if (cur.next.val == target) cur.next = cur.next.next;
            else {
                cur = cur.next;
            }
        }
        return head.next;
    }

    public static void main(String[] args) {
        LinkedList.print(delete(LinkedList.generate(new int[]{1, 2, 1, 2, 2, 1, 1, 1, 2}), 1));
    }
}
