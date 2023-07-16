package searching;

import java.util.Scanner;

public class getTheSunlight {
	public static int sunLight(int arr[]) {
		int max=arr[0];
		int counter=1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				counter++;
				max=arr[i];
			}
		}
		return counter;
	}
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
			
			System.out.println(sunLight(A));
		}

	}
}
