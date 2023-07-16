
public class dllMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doublyLinkedList dll = new doublyLinkedList();
		dll.insertBeg(4);
		dll.insertBeg(3);
		dll.print();
		System.out.println();
		
		dll.insertEnd(5);
		dll.print();
		System.out.println();
		
		dll.insertBeg(1);
		dll.print();
		System.out.println();
		
		dll.insertAfter(1,2);
		dll.print();
		System.out.println();
		
//		dll.insertBeg(1);
//		dll.print();
//		System.out.println();
		
		dll.delete(5);
		dll.print();
		System.out.println();
		
	}

}
