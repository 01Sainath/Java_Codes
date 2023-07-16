
import java.util.Scanner;
import java.util.Stack;

public class stackOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int Q=input.nextInt();
		
//		int A[][]=new int[Q][2];
		
		Stack <Integer> stack = new Stack<>();
		Stack <Integer> supportStack = new Stack<>();
		for(int i=0; i<Q; i++) {
			int First=input.nextInt();
			int Second;
			if(First==1) {
				Second=input.nextInt();
			
				stack.push(Second);
				if(supportStack.isEmpty()) {
					supportStack.push(Second);
				}
				else if(stack.peek()<=supportStack.peek()) {
					supportStack.push(Second);
				}
			}
		
			else if(First==2) {
				if(!stack.isEmpty()) {
					if(stack.peek()==supportStack.peek()) {
						supportStack.pop();
					}
					stack.pop();
				}
				else
					System.out.println(-1);
			}
		
			else if(First==3) {
				if(!stack.isEmpty())
					System.out.println(stack.peek());
				else
					System.out.println(-1);
			}
		
			else if(First==4) {
				if(supportStack.isEmpty()){
				  System.out.println(-1);
				}
				else{
				  System.out.println(supportStack.peek());
				}
			}
		}

	}
	

}
