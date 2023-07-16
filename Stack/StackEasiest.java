import java.util.Stack;

public class StackEasiest {
	
	public static void pushAtBottom(int data, Stack <Integer> s) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		pushAtBottom(data,s);
		s.push(top);
	}
	
	public static void reverse(Stack <Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int top = s.pop();
		reverse(s);
		pushAtBottom(top,s);
	}
	
	public static Stack <Integer> Reverse(Stack <Integer> s) {
		Stack <Integer> a = new Stack<>();
		
		while(!s.isEmpty()) {
			int top=s.peek();
			a.push(top);
			s.pop();
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> s = new Stack<>();
		
		s.push(1);
		s.push(2);
		s.push(3);
		Stack <Integer> a = Reverse(s);
		
		while(!a.isEmpty()) {
			System.out.println(a.pop());
		}
	}

}
