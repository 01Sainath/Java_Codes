
public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StackArray stackArray = new StackArray();
//		stackArray.push(1);
//		stackArray.push(2);
//		stackArray.push(3);
//		stackArray.push(4);
//		stackArray.push(5);
//		stackArray.push(6);
//		stackArray.push(7);
//		stackArray.push(8);
//		stackArray.push(9);
//		stackArray.push(10);
//		
////		System.out.println(stackArray.stack[stackArray.max-1]);
//		int data = stackArray.pop();
//		
//		System.out.println("Popped element is "+data);
//		System.out.println(stackArray.pop());
//		System.out.println(stackArray.pop());
		
		StackLinkedList stackList = new StackLinkedList();
		stackList.push(3);
		stackList.push(2);
		stackList.push(1);
		
		stackList.min();
	}

}
