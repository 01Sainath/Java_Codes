package linkedList;

public class SLLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.insertAtEnd(9);
		list.insertAtEnd(9);
		list.insertAtEnd(9);
		list.insertAtEnd(3);
//		list.insertAtEnd(1);
		
		list.addOne(list.head);
		
		list.print();
//		System.out.println(list.palindrome(list.head));

	}
	
	
	
	
	
	
	
	
//	list.insertAtBeg(5);
//	list.insertAtBeg(1);
//	
//	list.print();
//	System.out.println();
//	
//	list.insertAtEnd(6);
//	list.insertAtEnd(7);
//	
//	list.print();
//	System.out.println();
//	
//	list.insert(1, 2);
//	list.insert(2, 3);
//	list.insert(3, 4);
//	
//	list.print();
//	System.out.println();
//	
//	list.delete(7);
//	list.print();
//	System.out.println();
//	
//	list.reverse();
//	list.print();
//	System.out.println();
//	
////	list.head.next.next.next.next = list.head.next.next.next;
////	if(list.findCycle())
////		System.out.println("Cycle is present");
////	else
////		System.out.println("Cycle is not present");
//	
//	list.printReverse(list.head);
	

}
