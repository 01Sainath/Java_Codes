package linkedList;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class SinglyLinkedList {

	Node head=null;
	
	Node addOne(Node head) {
		Node newHead = reverse(head);
		
		Node tempNode=newHead;
		Node newNode=new Node(1);
		while(tempNode!=null && tempNode.data==9) {
			tempNode.data=0;
			if(tempNode.next!=null && tempNode.next.data!=9) {
				tempNode.next.data+=1;
				break;
			}
			else
				tempNode=tempNode.next;
		}
		
		if(tempNode==null) {
			newNode.next=head;
			head=newNode;
		}
		else
			newHead.data+=1;
		reverse(newHead);
		
		return head;
	}
	boolean palindrome(Node head) {
		if(head==null)
			return true;
		Node mid=midElement(head);
		Node last=reverse(mid);
		Node cur=head;
		while(last!=null) {
			if(last.data!=cur.data)
				return false;
			last=last.next;
			cur=cur.next;
		}
		return true;
	}
	
	void removeDuplicates() {
		Node tempNode=head;
		if(tempNode==null || tempNode.next==null) 
			return;
		
		while(tempNode!=null && tempNode.next!=null) {
			if(tempNode.data==tempNode.next.data) {
				tempNode.next=tempNode.next.next;
			}
				
			tempNode=tempNode.next;
		}
		return;
	}
	
	Node midElement(Node head) {
		Node slow=head;
		Node fast=head;
		
		while(head!=null && fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		
		return slow;
	}
	
	boolean findCycle() {
		Node slow=head, fast=head;
		
		while(slow!=null && fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
				return true;
		}
		return false;
	}
	
	void printReverse(Node Head) {
		if(Head==null) {
			return;
		}
		printReverse(Head.next);
		System.out.println(Head.data);
	}
 	
	Node reverse(Node head) {
		Node current = head, prev = null;
		
		while(current!=null) {
			Node next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		
		head=prev;
		
		return head;
	}
	
	void insertAtBeg(int data) {
		
		Node newNode = new Node(data);
		newNode.next=head;
		head=newNode;
	}
	
	void insertAtEnd(int data) {
		Node tempNode = head;
		Node newNode = new Node(data);
		
		if(tempNode==null) {
			head=newNode;
			return;
		}
		while(tempNode.next != null) {
			tempNode=tempNode.next;
		}
		tempNode.next=newNode;
	}
	
	void insert(int num, int data) {
		Node tempNode=head;
		while(tempNode != null && tempNode.data != num) {
			tempNode=tempNode.next;
		}
		
		Node newNode=new Node(data);
		newNode.next=tempNode.next;
		tempNode.next=newNode;
	}
	
	void delete(int num) {
		Node currentNode = head;
		Node prevNode = null;
		
		while(currentNode != null && currentNode.data != num) {
			prevNode=currentNode;
			currentNode=currentNode.next;
		}
		if(currentNode == head) {
			if(head == null) {
				System.out.println("List is empty");
				return;
			}
			head=head.next;
			return;
		}
		prevNode.next=currentNode.next;
	}
	void print() {
		Node tempNode=head;
		
		while(tempNode != null){
			System.out.print(tempNode.data+" ");
			tempNode=tempNode.next;
		}
	}

}
