package com.hugqq;

/**
 * 合并两个有序链表
 * @see <a href="https://leetcode-cn.com/problems/merge-two-sorted-lists/"></a>
 */
public class _21 {

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.println(mergeTwoLists(listNode1, listNode2));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        // 选取头结点
        ListNode res = list1.getVal() < list2.getVal() ? list1 : list2;
        res.setNext(mergeTwoLists(res.getNext(), list1.getVal() >= list2.getVal() ? list1 : list2));
        return res;
    }


}

