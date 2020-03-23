package com.javaelementary;

public class Task2 {

    /*
    2*) Задан отсортированный список который состоит из ListNode.
    Написать метод deleteDuplicates, который вернет список без дубликатов.
/**
* public class ListNode {
* int val;
* ListNode next;
* ListNode(int x) { val = x; }
* }
    public ListNode deleteDuplicates(ListNode head) { ...}
    Example:
    Input: 1->1->2->3->3
    Output: 1->2->3
    */

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            this.val = x;
        }
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(1);
        list.next.next = new ListNode(2);
        list.next.next.next = new ListNode(3);
        list.next.next.next.next = new ListNode(3);
        printList(list);
        deleteDuplicates(list);
        printList(list);
    }

    public static ListNode deleteDuplicates(ListNode list) {
        if (list == null) {
            return null;
        }
        if (list.next == null) {
            return list;
        }
        ListNode tmp = deleteDuplicates(list.next);
        if (list.val == tmp.val) {
            list.next = tmp.next;
        }
        return list;
    }

    private static void printList(ListNode list) {
        while (list != null) {
            System.out.print(list.val + " ");
            list = list.next;
        }
        System.out.println();
    }
}