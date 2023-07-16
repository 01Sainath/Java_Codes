import java.util.ArrayList;
import java.util.Stack;

public class nearestGreaterToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,0,0,1,2,4};
		
		ArrayList <Integer> list = new ArrayList<>();
		Stack <Integer> s = new Stack<>();
		
		for(int i=arr.length-1; i>=0; i--) {
			if(s.isEmpty()){
				list.add(-1);
			}
			else if((!s.isEmpty()) && s.peek()>arr[i]) {
				list.add(s.peek());
			}
			else if((!s.isEmpty()) && s.peek()<=arr[i]) {
				while((!s.isEmpty()) && s.peek()<=arr[i]){
					s.pop();
				}
				if(s.isEmpty()) {
					list.add(-1);
				}
				else
					list.add(s.peek());
			}
			s.push(arr[i]);
		}
		
		for(int i=list.size()-1; i>=0; i--) {
			System.out.print(list.get(i)+" ");
		}
 	}

}
