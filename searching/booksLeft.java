package searching;

import java.util.Scanner;

public class booksLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int N=input.nextInt();
		long K=input.nextInt();
		
		long A[]=new long[N];
		
		for(int i=0; i<N; i++) {
			A[i]=input.nextLong();
		}
		
		System.out.println(books(A,N,K));
	}

	private static int books(long[] A, int N, long K) {
		// TODO Auto-generated method stub
		int startIndex=0;
		int endIndex=N-1;
		int counter=N;
		
		while((startIndex<=endIndex) && (A[startIndex]<=K || A[endIndex]<=K)) {
			if(N==1) {
				if(A[0]<=K)
					return 0;
			}
			else {
				if(A[startIndex]<=K) {
					counter--;
					startIndex++;
				}
				if(A[endIndex]<=K) {
					counter--;
					endIndex--;
				}		
			}
			
		}
		if(counter<0)
			return 0;
		return counter;
	}

}
