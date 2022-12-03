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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmp=head;
        int c=0;
        while(tmp!=null){
            tmp=tmp.next;
            c++;
        }
        if(c==n) return head=head.next;
        ListNode currentNode=head;
        for(int i=1;i<c-n;i++){
            currentNode=currentNode.next;
        }
        currentNode.next=currentNode.next.next;
        return head;
    }
}