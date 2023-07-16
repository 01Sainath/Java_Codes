import java.util.Arrays;
import java.util.Scanner;

public class greaterThanNeighbor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		
		while(T-->0) {
			
			int N = input.nextInt();
			int A[] = new int[N];
			int No = -1;
			
			for(int i=0; i<N; i++) {
				A[i] = input.nextInt();
			}
			
			if(A[0]>A[1])
				System.out.print(0+" ");
			
			for(int i=1; i<N-1; i++) {
				if(A[i]>A[i-1] && A[i]>A[i+1])
					System.out.print(i+" ");
			}
			
			if(A[N-1]>A[N-2])
				System.out.print(N-1+" " );
			
			Arrays.sort(A);
			
			if(A[0] == A[N-1])
				System.out.print(No);
		}
	}

}
