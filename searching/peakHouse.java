package searching;

import java.util.Scanner;

public class peakHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int T=input.nextInt();
		while(T-->0) {
			int n=input.nextInt();
			int A[]=new int[n];
			
			for(int i=0; i<n; i++) {
				A[i]=input.nextInt();
			}

			peak(A,n);
		}
	}

	private static void peak(int[] a, int n) {
		// TODO Auto-generated method stub
		if(a[0]>a[1])
			System.out.println(0);
		if(a[n-1]>a[n-2])
			System.out.println(n-1);
		
		for(int i=1; i<n-1; i++) {
			if(a[i]>a[i-1] && a[i]>a[i+1])
				System.out.println(i);
		}
		
	}

}
