package searching;

import java.util.Arrays;
import java.util.Scanner;

public class majorityVotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int T=input.nextInt();
		while(T-->0) {
			int N=input.nextInt();
			int A[]=new int[N];
			
			for(int i=0; i<N; i++) {
				A[i]=input.nextInt();
			}
			Arrays.sort(A);
			System.out.println(winner(A,N,N/2));
		}
	}

	private static int winner(int[] a, int N, int half) {
		// TODO Auto-generated method stub
		int winner=a[0];
		int counter=1;
		
		for(int i=1; i<N; i++) {
			if(a[i]==winner)
				counter++;
			else {
				if(counter>half)
					return winner;
				else {
					winner=a[i];
					counter=1;
				}
			}
		}
		if(counter>half)
			return winner;
		return -1;
	}

}
