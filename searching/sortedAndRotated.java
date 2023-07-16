package searching;

import java.util.Scanner;

public class sortedAndRotated {
	
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
	
	public static int findPivot(int arr[], int low, int high) {
		if(low>high)
			return -1;
		int mid=low+(high-low)/2;
		
		if(mid<high && arr[mid]>arr[mid+1])
			return mid+1;
		if(mid>low && arr[mid]<arr[mid-1])
			return mid;
		
		if(arr[low]<arr[mid])
			return findPivot(arr,mid+1,high);
		return findPivot(arr,low,mid-1);
	}
	
	public static int findKey(int arr[], int n, int key) {
		int pivot=findPivot(arr,0,n-1);
		if(pivot==-1)
			return binarySearchingRec(arr,0,n-1,key);
		if(arr[pivot]==key)
			return pivot;
		if(arr[0]<=key)
			return binarySearchingRec(arr,0,pivot-1,key);
		return binarySearchingRec(arr,pivot+1,n-1,key);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int T=input.nextInt();
		
		while(T-->0) {
			int N=input.nextInt();
			
			int arr[]=new int[N];
			
			for(int i=0;i<N;i++) {
				arr[i]=input.nextInt();
			}
			int x=input.nextInt();
			
			System.out.println(findKey(arr,N,x));
		}
	}

}
