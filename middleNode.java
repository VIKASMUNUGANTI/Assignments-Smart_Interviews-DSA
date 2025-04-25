//Problem link : https://leetcode.com/problems/middle-of-the-linked-list/submissions/1295377521/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 // Using Index Counting
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode curr=head;
        int size=0;
        while(curr.next!=null)
        {
            size++;
            curr=curr.next;
        }
        int mid=0;
        if(size%2==0){
           mid=size/2; 
        }
        else{
            mid=(size/2)+1;
        }
        curr=head;
        for(int i=0;i<mid;i++)
        {
            curr=curr.next;
        }
        return curr;
    }
}

//Using Fast anf Slow pointer

class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null)
        {
            fast =fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}