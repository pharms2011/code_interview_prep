package com.oracle.easy;

import org.junit.Test;

public class MergeSortedListsTest {

    @Test
    public void test(){
        MergeSortedLists.ListNode a = new MergeSortedLists.ListNode(1);
        a.next = new MergeSortedLists.ListNode(2);
        a.next.next = new MergeSortedLists.ListNode(4);
        MergeSortedLists.ListNode b = new MergeSortedLists.ListNode(1);
        b.next = new MergeSortedLists.ListNode(3);
        b.next.next = new MergeSortedLists.ListNode(4);

        MergeSortedLists.mergeTwoLists(a,b);
    }
}
