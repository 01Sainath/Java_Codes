
public class StackArray {
		// TODO Auto-generated method stub
		int top=-1;
		int max=10;
		int stack[] = new int[max];
	
	
	boolean isFull() {
		if(top==(max-1))
			return true;
		return false;
	}
	
	boolean push(int data) {
		if(isFull()) {
			System.out.println("Stack overflow.");
			return false;
		}
		stack[++top]=data;
		return true;
	}
	
	boolean isEmpty() {
		return (top<0);
	}
	
	int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty.");
			return -1;
		}
		int data = stack[top];
		top--;
		return data;
	}
	
	void print() {
		
		
	}

}
