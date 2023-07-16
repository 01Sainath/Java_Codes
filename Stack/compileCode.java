
import java.util.Scanner;
import java.util.Stack;

public class compileCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		while(T-->0) {
			int n=input.nextInt();
			String c=input.next();
			
			
			if(c.charAt(0)=='>') {
				System.out.println(0);
			}
			else{
				if(func(c,n)==n) {
					System.out.println(n);
				}
				else {
					func1(c,n);
				}
			}
				
			
			
		}
		
	}
	
	private static void func1(String c, int n) {
		// TODO Auto-generated method stub
		Stack <Character> stack1 = new Stack<>();
		
	}

	public static int func(String c, int n) {
		int counter=0;
		Stack <Character> stack = new Stack<>();
		for(int i=0; i<n; i++) {
			if(c.charAt(i)=='<') {
				stack.push(c.charAt(i));
			}
			else if(!stack.isEmpty()) {
				stack.pop();
				counter+=2;
			}
		}
		return counter;
	}
}
