import java.util.Scanner;
import java.util.Stack;

public class compileCodeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in);
		
		int T=input.nextInt();
		while(T-->0) {
			int n=input.nextInt();
			String c=input.next();
			
			Stack <Character> stack =new Stack<>();
			int counter=0;
			for(int i=0; i<n; i++) {
				char ch=c.charAt(i);
				if(stack.isEmpty() && ch=='>')
					break;
				
				if(ch=='<')
					stack.push(ch);
				else {
					stack.pop();
					counter+=2;
				}
			}
			
			if(stack.isEmpty()) 
				System.out.println(counter);
			else
				System.out.println(0);
		}
	}

}
