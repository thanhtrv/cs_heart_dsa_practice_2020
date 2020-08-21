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
    public void reorderList(ListNode head) {
        
        
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode curr = head;
        while (curr != null) {
            stack.push(curr);
            curr = curr.next;
        }
        
        curr = head;
        int n = stack.size();
        if(n<2) return;
        
        
        ListNode next_temp;
        for (int i = 0; i< n/2; i++) {
            next_temp = curr.next;
            curr.next = stack.pop();
            
            curr = curr.next;
            
            curr.next = next_temp;
            
            curr = curr.next;
        }
        
        curr.next = null;
        
//         O(n) AND o(N) for time and space complexity
//         if (head == null || head.next == null) return;
        
//         ListNode slow = head, fast = head;
//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
// //         reverse the half of the list
//         ListNode prev = null, curr = slow, tmp;
//         while(curr != null){
// //             save to move to the next node later
//             tmp = curr.next;
// //             point to the previous node
//             curr.next = prev;
            
// //             set the current to be previous for the next one.
//             prev = curr;
            
// //             move curr to next node.
//             curr = tmp;
//         }
        
        
// //         loop t
//         ListNode n1 = head, n2 = prev;
// //         if n2.next point to null then keep the same
//         while(n2.next != null){
//             tmp = n1.next;
// //             point to head node of list 2
//             n1.next = n2;
            
// //             move to next node of list 1
//             n1 = tmp;
            
//             tmp = n2.next;
// //             point next node to the second node of list 1
//             n2.next = n1;
// // point to next tmp.
//             n2 = tmp;
//             // 1->2->null
//             // 5->4->3->null
                
//         }        
        
        

        
    }
}
