package searching;

import java.util.Scanner;

public class unorderedLinearSearch {
	public static int find(int arr[], int n, int a) {
		for(int i=0; i<n; i++) {
			if(arr[i]==a)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int arr[]=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=input.nextInt();
		}
		
		int a=input.nextInt();
		
		System.out.println(find(arr,n,a));
		
	}

}
