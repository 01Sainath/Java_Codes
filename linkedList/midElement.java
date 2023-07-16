package linkedList;

import java.util.Scanner;

public class midElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int T=input.nextInt();
		while(T-->0) {
			SinglyLinkedList list=new SinglyLinkedList();
			int N=input.nextInt();
			for(int i=0; i<N; i++) {
				int l=input.nextInt();
				list.insertAtEnd(l);
			}
			
			System.out.println(list.midElement(list.head).data);
		}
		
	}

}
