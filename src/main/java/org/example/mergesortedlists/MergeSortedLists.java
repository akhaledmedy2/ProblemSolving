package org.example.mergesortedlists;

public class MergeSortedLists {
    public static void main(String[] args) {

        ListNode list1 = new ListNode(4);
        list1 = new ListNode(2, list1);
        list1 = new ListNode(1, list1);


        ListNode list2 = new ListNode(4);
        list2 = new ListNode(3, list2);
        list2 = new ListNode(1, list2);

        ListNode listNode = mergeTwoLists(list1, list2);
        System.out.println(listNode);

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}