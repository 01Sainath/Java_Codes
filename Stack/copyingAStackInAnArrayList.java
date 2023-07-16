import java.util.ArrayList;
import java.util.Stack;

public class copyingAStackInAnArrayList {
	
	public static void copy(Stack <Integer> stack) {
		Stack <Integer> s = stack;
		ArrayList <Integer> arr = new ArrayList<>();
		while(!s.isEmpty()) {
			arr.add(s.pop());
		}
		
		System.out.println(arr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> stack = new Stack<>();
		
		stack.push(3);
		stack.push(2);
		stack.push(4);
		stack.push(6);
		
		copy(stack);
	}

}
