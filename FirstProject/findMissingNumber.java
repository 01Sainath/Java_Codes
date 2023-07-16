import java.util.Scanner;

public class findMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		
		while(T-->0) {
			
			int N = input.nextInt();
			int A[] = new int[N-1];
			long Sum=0;
			long Total = ((long)N*(N+1))/2;
			
			for(int i=0; i<N-1; i++) {
				A[i] = input.nextInt();
				Sum = Sum+A[i];
			}
			
			System.out.println(Total-Sum);
			
		}
	}

}
