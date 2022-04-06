package com.oracle.easy;

public class MergeSortedLists {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    /**
     * Runtime: 1 ms, faster than 73.39% of Java online submissions for Merge Two Sorted Lists.
     * Memory Usage: 43.6 MB, less than 14.26% of Java online submissions for Merge Two Sorted Lists.
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sortedListHead = list1.val<list2.val? new ListNode(list1.val): new ListNode(list2.val);
        // go through each list nad compare the first nodes, add the smallest to the new sorted array
        ListNode a = list1,b = list2;
        if(a.val < b.val){
            a = a.next;
        }
        else{
            b=b.next;
        }
        ListNode curr= sortedListHead;
        while(a!= null &&  b != null){
            if(a.val < b.val){
                curr.next = new ListNode(a.val);
                curr = curr.next;
                a = a.next;
            }
            else{
                curr.next = new ListNode(b.val);
                curr = curr.next;
                b=b.next;
            }
        }
        if(a != null){
            curr.next = new ListNode(a.val, a.next);
        }
        if(b != null){
            curr.next = new ListNode(b.val, b.next);
        }
        return sortedListHead;
    }
}
