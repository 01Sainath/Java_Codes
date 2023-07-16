package recursion;

import java.util.Scanner;

public class printBinary {
	public static void Binary(int a[], int k, int n) {
		if(k==n) {
			for(int i=0; i<n; i++)
				System.out.print(a[i]);
			System.out.println();
			return;
		}
		if(a[k-1] == 0) {
			a[k] = 0;
			Binary(a, k+1, n);
			a[k] = 1;
			Binary(a, k+1, n);
		}
		else {
			a[k] = 0;
			Binary(a, k+1, n);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		while(T-->0) {
			int n = input.nextInt();
			int a[] = new int[n];
			a[0]=0;
			Binary(a, 1, n);
			a[0]=1;
			Binary(a, 1, n);
		}
	}

}
