package searching;

import java.util.Arrays;
import java.util.Scanner;

public class medianAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int N=input.nextInt();
		long K=input.nextLong();
		
		long A[]=new long[N];
		for(int i=0; i<N; i++) {
			A[i]=input.nextLong();
		}
		Arrays.sort(A);
		int mid=(0+(N-1))/2;
//		System.out.println(mid);
		
		for(long i=K; i>0; i--) {
			if(A[mid]<A[mid+1])
				A[mid]++;
		}
		
		System.out.println(A[mid]);
	}

}
