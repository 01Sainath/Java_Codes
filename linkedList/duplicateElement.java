package linkedList;

import java.util.Scanner;

public class duplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		SinglyLinkedList list=new SinglyLinkedList();
		
		int N=input.nextInt();
		
		for(int i=0; i<N; i++) {
			list.insertAtEnd(input.nextInt());
		}
		
		list.removeDuplicates();

		list.print();
	}

}
