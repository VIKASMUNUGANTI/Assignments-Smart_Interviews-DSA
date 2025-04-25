//https://leetcode.com/problems/palindrome-linked-list/description/

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
class Solution {
    public boolean singly_linked_list_isPalindrome(ListNode head) {
        ListNode h1=head;
        ListNode h2=head;
        while(h1!=null && h1.next!=null)
        {
            h2=h2.next;
            h1=h1.next.next;
        }
        ListNode rev= reverse(h2);
        ListNode p1= head;
        ListNode p2= rev;
        while(p2 != null)
        {
            if(p1.val!=p2.val){
                return false;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }
    public ListNode reverse(ListNode h2)
    {
        ListNode prev=null;
        ListNode curr=h2;
        ListNode n=h2;
        while(curr!=null)
        {
            n=curr.next;
            curr.next=prev;
            prev=curr;
            curr=n; 
        }
        return prev;
    }
}