package searching;

import java.util.Arrays;
import java.util.Scanner;

public class difficultyCoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int T=input.nextInt();
		while(T-->0) {
			int n=input.nextInt();
			int arr[]=new int[n];
			
			for(int i=0; i<n; i++) {
				arr[i]=input.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(findOne(arr,n));
		}
	}

	public static String findOne(int[] arr, int n) {
		// TODO Auto-generated method stub
		if(arr[n-1]==1)
			return "hard";
		else
			return "easy";
	}
}
