package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class arrangingTheStones {

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
			
			bubbleSort(arr,N);
			
			for(int i=0; i<N; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}

	public static void bubbleSort(int[] arr, int n) {
		// TODO Auto-generated method stub
		for(int i=n-1; i>0; i--) {
			int flag=0;
			for(int j=0; j<i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
				break;
		}
	}

}
