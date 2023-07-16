package linkedList;

import java.util.Scanner;

public class palindromeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		
		SinglyLinkedList list=new SinglyLinkedList();
		
		for(int i=0; i<n; i++) {
			list.insertAtEnd(input.nextInt());
		}
		
		System.out.println(list.palindrome(list.head));
		
	}

}
