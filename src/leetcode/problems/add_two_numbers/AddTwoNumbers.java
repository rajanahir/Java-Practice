package leetcode.problems.add_two_numbers;

import java.util.Arrays;

/**
 * Definition for singly-linked list.
 * */

 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class AddTwoNumbers {

	public static void main(String[] args) {
		
		ListNode n1 = new ListNode(9);
		ListNode n2 = new ListNode(4, n1);
		ListNode n3 = new ListNode(2, n2);
		
		ListNode n_1 = new ListNode(9);
		ListNode n_2 = new ListNode(4, n_1);
		ListNode n_3 = new ListNode(6, n_2);
		ListNode n_4 = new ListNode(5, n_3);
		AddTwoNumbers add = new AddTwoNumbers();
		add.addTwoNumbers( n3, n_4 );
		// TODO Auto-generated method stub

	}
	
	
		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode dummyHead  = new ListNode(0);
			ListNode curr = dummyHead;
			int carry = 0;
			while (l1 != null || l2 != null || carry != 0) {
				int x = l1 != null ? l1.val: 0;
				int y = l2 != null ? l2.val: 0;
				int sum = x + y + carry;
				carry = sum/10;
				curr.next = new ListNode( sum % 10);
				curr = curr.next;
				if(l1 != null)
					l1 = l1.next;
				if(l2 != null)
					l2 = l2.next;

			}
	        
	        return dummyHead.next;
	        
		}

		public String nodeValue(ListNode l) {
		String val = "";
		if ( l.next == null ) {
		        val =  l.val + "";
		        return val;
		    } else { 
		        val =  l.val + "";
		        val += nodeValue(l.next);
		    }
		return val;
		}
		
		public ListNode reverseNode( ListNode ln ) {
			ListNode current = ln;
			ListNode prev = null;
			ListNode next = null;
			
			while ( current != null ) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			
			ln = prev;
			return ln;
		}
}
