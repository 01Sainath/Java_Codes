import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingCollectionsFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue <Integer> q = new LinkedList<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		
		System.out.println(q);
		while(!q.isEmpty()) {
			System.out.print(q.remove()+ " ");
		}
	}

}
