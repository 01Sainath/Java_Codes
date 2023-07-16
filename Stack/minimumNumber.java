import java.util.Scanner;
import java.util.Stack;

public class minimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n =input.nextInt();
		Stack <Integer> stack = new Stack<>();
		
		for(int i=0; i<n; i++) {
			int data=input.nextInt();
			if(stack.isEmpty() || stack.peek()>=data) {
				stack.push(data);
			}
			else {
				int temp = stack.pop();
				stack.push(data);
				stack.push(temp);
			}
		}
		
		System.out.println(stack.peek());
	}

}
