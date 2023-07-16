
class Node {
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class StackLinkedList {
	
	Node head = null;
	void push(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head=newNode;
		}
		newNode.next = head;
		head = newNode;
	}
	
	int pop() {
		if(head==null) {
			System.out.println("Stack is empty.");
			return -1;
		}
		int data= head.data;
		head=head.next;
		return data;
	}
	
	int top() {
		if(head==null)
			return -1;
		return head.data;
	}
	
	void min() {
		Node i=head;
		if(head==null) {
			System.out.println(-1);
			return;
		}
		
		int min=head.data;
		while(i!=null) {
			if(i.data<min) {
				min=i.data;
			}
			i=i.next;
		}
		
		System.out.println(min);
	}
}
