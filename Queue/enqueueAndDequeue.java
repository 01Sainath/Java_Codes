import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class enqueueAndDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n=input.nextInt();
		
		Queue <Integer> q = new LinkedList<>();
		for(int i=0; i<n; i++) {
			q.add(input.nextInt());
			System.out.println(q);
		}
	}

}
