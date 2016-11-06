/*
Author:    Mythri Garaga Manjunatha
Problem:   Remove Nth Node From End of List
Source:    https://leetcode.com/problems/remove-nth-node-from-end-of-list/
Notes:     Given a linked list, remove the nth node from the end of list and return its head.
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode dummy = new ListNode(0);
      dummy.next = head;
      ListNode first = dummy;
      ListNode second  = dummy;
      
      for(int i = 1; i <= n+1; i++){
          first = first.next;
          
      } 
      
      while(first != null){
           first = first.next;
           second = second.next;
      }
      second.next = second.next.next;
      return dummy.next;
    }  
}
