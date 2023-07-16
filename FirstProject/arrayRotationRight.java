import java.util.Scanner;

public class arrayRotationRight {
	public static void reversal(int a,int b, int arr[]) {
		for(int i = a; i<b; i++) {
			int temp = arr[i];
			arr[i] = arr[b];
			arr[b] = temp;
			b--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		while(T-->0) {
			int N = input.nextInt();
			int K = input.nextInt();
			if(K>N)
				K=K%N;
			int A[] = new int[N];
			
			for(int i=0; i<N; i++) {
				A[i] = input.nextInt();
			}
			
			reversal(N-K, N-1, A);
			reversal(0,N-K-1,A);
			reversal(0,N-1,A);
			
			for(int res: A) {
				System.out.print(res+" ");
			}
		}
	}

}
