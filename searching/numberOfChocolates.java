package searching;

import java.util.Arrays;
import java.util.Scanner;
	
public class numberOfChocolates {
	public static int chocolates(int arr[], int n, int data) {
		int counter=0;
		for(int i=0; i<n; i++) {
			if(arr[i]<=data)
				counter++;
			else
				break;
		}
		return counter;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int N=input.nextInt();
		int A[]=new int[N];
		for(int i=0; i<N; i++) {
			A[i]=input.nextInt();
		}
		
		Arrays.sort(A);
		
		int q=input.nextInt();
		int Q[]=new int[q];
		for(int i=0; i<q; i++) {
			Q[i]=input.nextInt();
		}
		for(int i=0; i<q; i++) {
			System.out.println(chocolates(A,N,Q[i]));
		}
	}

}
