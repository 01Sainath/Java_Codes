package searching;

import java.util.Arrays;
import java.util.Scanner;

public class smallestNumber {
	public static int smallest(int arr[],int k) {
		int small=arr[0];
		int counter=1;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]==small)
				counter++;
			else {
				if(counter==k) {
					return small;
				}
				else {
					small=arr[i];
					counter=1;
				}
			}
		}
		return small;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int N=input.nextInt();
		
		int A[]=new int[N];
		
		for(int i=0; i<N; i++) {
			A[i]=input.nextInt();
		}
		int K=input.nextInt();
//		for(int res:A) {
//			System.out.println(res);
//		}
		Arrays.sort(A);
		System.out.println(smallest(A,K));
	}

}
