
class Node {
	int data;
	Node next;
	Node prev;
	
	Node(int data){
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}

public class doublyLinkedList {

	Node head = null;
	
	boolean palindrome() {
		Node l=head;
		Node r=head;
		
		while(r!=null && r.next!=null) {
			r=r.next;
		}
		
		while(l!=r) {
			if(l.data!=r.data)
				return false;
			l=l.next;
			r=r.prev;
		}
		return true;
	}
	void insertBeg(int data) {
		
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
		return;
	}
	
	void insertEnd(int data) {
		Node newNode=new Node(data);
		
		if(head==null) {
			head=newNode;
			return;
		}
		
		Node tempNode = head;
		while(tempNode.next != null) {
			tempNode = tempNode.next;
		}
		tempNode.next=newNode;
		newNode.prev=tempNode;
	}
	
	void insertAfter(int num, int data) {
		Node tempNode=head;
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		while(tempNode != null && tempNode.data != num) {
			tempNode=tempNode.next;
		}
		
		newNode.next=tempNode.next;
		if(newNode.next != null)
			newNode.next.prev=newNode;
		tempNode.next=newNode;
		newNode.prev=tempNode;
	}
	
	void delete(int num) {
		if(head==null) {
			System.out.println("empty list");
		}
		
		Node delNode = head;
		while(delNode != null && delNode.data != num) {
			delNode = delNode.next;
		}
		if(delNode==head) {
			head=head.next;
			head.prev=null;
			return;
		}
		
		delNode.prev.next=delNode.next;
		if(delNode.next != null)
			delNode.next.prev=delNode.prev;
		
	}
	void print() {
		Node tempNode=head;
		
		while(tempNode != null){
			System.out.print(tempNode.data+" ");
			tempNode=tempNode.next;
		}
	}
	
}