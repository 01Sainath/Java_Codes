import java.util.Scanner;

public class FindleaderNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		
		while(T-->0) {
			
			int N = input.nextInt();
			int A[] = new int[N];
			
			for(int i=0; i<N; i++) {
				A[i] = input.nextInt();
			}
			
			int max = A[N-1];
				System.out.print(max+" ");
    	
    	for(int i = N-2; i>=0; i--) {
    		if(max<=A[i]) {
    			max = A[i];
    			System.out.print(A[i]+" ");
    		}
    	}
			
			System.out.println();
		}
	}

}
