import java.util.Scanner;
import java.util.Stack;

public class getMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Stack <Integer> stack  = new Stack<>();
		Stack <Integer> supportStack = new Stack<>();
		
		int N=input.nextInt();
		for(int i=0; i<N; i++) {
			int data=input.nextInt();
			stack.push(data);
			if(supportStack.isEmpty() || stack.peek()<=supportStack.peek()) {
				supportStack.push(data);
			}
		}
		
		System.out.println(supportStack.peek());
	}

}
