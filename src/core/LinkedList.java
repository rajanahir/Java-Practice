package core;

public class LinkedList {
	
	
public static void main(String[] args) {
		ListNode a = new ListNode();
		a.val = -1;
		ListNode b = new ListNode();
		b.val = 5;
		ListNode c = new ListNode();
		c.val = 3;
		ListNode d = new ListNode();
		d.val = 4;
		ListNode e = new ListNode();
		e.val = 0;
		
		d.next = e;
		c.next = d;
		b.next = c;
		a.next = b;
		
		LinkedList ls = new LinkedList();
		ls.sortList(a);
				
}
	
public ListNode sortList(ListNode head) {
	ListNode current = head;
	ListNode index = null;
	
	int tempVal;
	
	
	while ( current != null ) {
		 
		index = current.next;
		while ( index != null ) {
				
				if ( current.val > index.val ) {
					tempVal = current.val;
					current.val = index.val;
					index.val = tempVal;
				}
				index = index.next;
		}
		
		System.out.println(current.val);
		current = current.next;
			
	}
	
	
	
	return current;
}
	


}


