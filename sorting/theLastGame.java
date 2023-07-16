package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class theLastGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int T=input.nextInt();
		while(T-->0) {
			int N=input.nextInt();
			int arr[]=new int[N];
			
			for(int i=0; i<N; i++) {
				arr[i]=input.nextInt();
			}
			
			insertion(arr,N);
			
			int t2=N-1;
			
			for(int i=1; i<N; i++) {
				if(i%2!=0) {
					t2--;
				}
			}
			
			System.out.println(arr[t2]);
			
//			for(int res:arr) {
//				System.out.print(res+" ");
//			}
		}
	}

	public static void insertion(int[] arr, int n) {
		// TODO Auto-generated method stub
		for(int i=1; i<n; i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
			
		}
	}

}
