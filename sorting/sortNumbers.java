package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class sortNumbers {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	      
	      int T=input.nextInt();
	      while(T-->0){
	        int N=input.nextInt();
	        
	        int arr[]=new int[N];
	        for(int i=0; i<N; i++){
	          arr[i]=input.nextInt();
	        }
	        
	        selection(arr,N);
	        
	        for(int i=0; i<N; i++){
	          System.out.print(arr[i]+" ");
	        }
	      }
	}

	public static void selection(int[] arr, int n) {
		// TODO Auto-generated method stub
		for(int i=0; i<n-1; i++) {
			int min=i;
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
	}
}
