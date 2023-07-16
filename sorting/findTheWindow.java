package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class findTheWindow {

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
			
			int copy[]=Arrays.copyOf(A,N);
		
			Arrays.sort(copy);
			
			int start=0;
			int end=N-1;
			
			for(int i=0; i<N; i++) {
				if(A[start]==copy[start])
					start++;
				if(A[end]==copy[end])
					end--;
			}
			
			System.out.println(start+" "+end);
			
		}
		
	}

}
