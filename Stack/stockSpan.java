import java.util.ArrayList;
import java.util.Stack;

public class stockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,20,30,5,10,20,50};
		
		ArrayList <Integer> list = new ArrayList<>();
		Stack <Integer> s = new Stack<>();
		
		for(int i=0; i<arr.length; i++) {
			if(s.isEmpty())
				list.add(-1);
			else if((!s.isEmpty()) && arr[s.peek()]>arr[i]) {
				list.add(s.peek());
			}
			else if((!s.isEmpty()) && arr[s.peek()]<=arr[i]) {
				while((!s.isEmpty()) && arr[s.peek()] <=arr[i]) {
					s.pop();
				}
				if(s.isEmpty())
					list.add(-1);
				else
					list.add(s.peek());
			}
			s.push(i);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i-list.get(i)+" ");
		}
	}

}
