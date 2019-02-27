package model;

public class ReverseListInterface {
	// Please do not change this interface
	interface ListNode {
		int getItem();

		ListNode getNext();

		void setNext(ListNode next);
	}

	public static ListNode reverse(ListNode node) {
		/*
		 * Please implement this method to reverse a given linked list.
		 */
		if (node == null || node.getNext() == null)
			return node;

		ListNode temp = null;
		ListNode prev = null;

		while (node != null) {
			temp = node.getNext();
			node.setNext(prev);
			prev = node;
			node = temp;

		}
		return prev;

//		 ListNode prev = null;
//		 ListNode possibleRoot? = null;
//       ListNode curr = node;
//		 ListNode next = curr.getNext();
// 		 while (curr != null) {
// 			next = curr.getNext();
//		    curr.setNext(prev); 
//		    possibleRoot = curr;
//   		curr = next;
//		}
//		 return possibleRoot;

	}
}
