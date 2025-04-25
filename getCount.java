// https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/1

class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        int cnt=0;
        Node c=head;
        while(c.next != null){ 
            cnt++;
            }
        return cnt;
        
    }
}