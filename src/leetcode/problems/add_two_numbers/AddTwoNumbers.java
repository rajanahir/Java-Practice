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
	        String sl1 = nodeValue(l1);
	        String sl2 = nodeValue(l2);
	        String sum =  (Integer.parseInt(sl1) + Integer.parseInt(sl2)) + "";
	        
	        ListNode tempN = null;
	        
	        for (int i=0; i < sum.length(); i++) {
	        		if ( i <= 0 ) tempN = new ListNode(Integer.parseInt(sum.charAt(i) + ""));
	        		else 
	        			tempN = new ListNode(Integer.parseInt(sum.charAt(i) + ""), tempN);
	        }
	        
	        return tempN;
	        
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
