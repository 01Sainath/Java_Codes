import java.util.ArrayList;
import java.util.Scanner;

public class stockSpanBrute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T =input.nextInt();
		while(T-->0) {
			int n=input.nextInt();
			int A[]=new int[n];
			
			for(int i=0; i<n; i++) {
				A[i]=input.nextInt();
			}
			
//			ArrayList <Integer> list = new ArrayList<>();
			for(int i=0; i<n; i++) {
				int counter=0;
				for(int j=i; j>=0; j--) {
					if(A[j]>A[i])
						break;
					else
						counter++;
				}
//				list.add(counter);
				System.out.print(counter+" ");
			}
			
//			System.out.println(list);
		}
		
	}

}
