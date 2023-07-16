import java.util.Scanner;

public class rearrangeTheArray {

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
			
			int arr[] = new int[N];
			
			for(int i=0; i<N/2; i++) {
				arr[i+i] = A[N-1-i];
				
				arr[i+i+1] = A[i];
			}
			if(N%2!=0)
				arr[N-1] = A[N/2];
			for(int i=0; i<N; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
