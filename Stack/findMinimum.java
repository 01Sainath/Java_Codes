import java.util.Stack;

public class findMinimum {

	public static int getMin(Stack <Integer> stack) {
		Stack <Integer> s = new Stack<>();
		
		while(!stack.isEmpty()) {
			int top = stack.pop();
			if(s.isEmpty()) {
				s.push(top);
			}
			else if(s.peek()>top) {
				s.push(top);
			}
			else {
				int temp = s.pop();
				s.push(top);
				s.push(temp);
			}	
		}
		
		return s.peek();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> stack = new Stack<>();
		stack.push(7);
		stack.push(4);
		stack.push(21);
		stack.push(10);
		
		int min = getMin(stack);
		
		System.out.println(min);
	}

}
