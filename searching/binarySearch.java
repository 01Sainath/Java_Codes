package searching;

import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int arr[]=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=input.nextInt();
		}
		
		int a=input.nextInt();
		
		System.out.println(binarySearchingIterative(arr,0,n-1,a));
	}

	public static int binarySearchingRec(int[] arr, int low, int high, int data) {
		// TODO Auto-generated method stub
		if(low>high)
			return -1;
		
		int mid=low+(high-low)/2;
		
		if(arr[mid]==data)
			return mid;
		if(arr[mid]>data)
			return binarySearchingRec(arr, low, mid-1, data);
		return binarySearchingRec(arr, mid+1, high, data);
	}
	public static int binarySearchingIterative(int arr[], int low, int high, int data) {
		while(low<=high) {
			int mid=low+(high-low)/2;
			
			if(arr[mid]==data)
				return mid;
			else if(arr[mid]>data)
				high=mid-1;
			else
				low=mid+1;
		}
		return -1;
	}
}


