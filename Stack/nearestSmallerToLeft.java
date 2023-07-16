import java.util.ArrayList;
import java.util.Stack;

public class nearestSmallerToLeft {
	public static void main(String[]args) {
		
		int arr[] = {4,5,2,10,8};
		
		ArrayList <Integer> list = new ArrayList<>();
		Stack <Integer> s = new Stack<>();
		
		for(int i=0; i<arr.length; i++) {
			if(s.isEmpty())
				list.add(-1);
			else if((!s.isEmpty()) && s.peek()<arr[i])
				list.add(s.peek());
			else if((!s.isEmpty()) && s.peek()>=arr[i]) {
				while((!s.isEmpty()) && s.peek()>=arr[i]) {
					s.pop();
				}
				if(s.isEmpty()) 
					list.add(-1);
				else
					list.add(s.peek());
			}
			s.push(arr[i]);
		}
		
		System.out.println(list);
	}
}
