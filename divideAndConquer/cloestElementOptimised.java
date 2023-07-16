package divideAndConquer;

import java.util.Scanner;

public class cloestElementOptimised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while(t-->0) {
			int n = input.nextInt();
			
			int arr[] = new int[n];
			
			for(int i=0; i<n; i++) {
				arr[i] = input.nextInt();
			}
			
			int k = input.nextInt();
			System.out.println(answer(arr,k));
		}
	}
	
	static int binarySearch(int arr[], int k) {
		
		int n = arr.length;
		int l = 0;
		int r = n-1;
		
		while(l<=r) {
			int mid = (l+r)/2;
			
			if(arr[mid]==k) {
				return mid;
			}
			else if(arr[mid]<k) {
				l=mid+1;
			}
			else
				r=mid-1;
		}
		
		return -1;
		
	}
	
	static int answer(int arr[], int k) {
		
		int n = arr.length;
		int l = 0;
		int r = n-1;
		
		if(k<=arr[0])
			return arr[0];
		if(k>=arr[n-1]) 
			return arr[n-1];
		
		while(l<=r) {
			int mid = (l+r)/2;
			
			if(arr[mid] == k) {
				return arr[mid];
			}
			else if(arr[mid]>k) {
				if(arr[mid-1]<k) {
					int x1=arr[mid]-k;
					int x2=k-arr[mid-1];
					
					if(x1<x2) {
						return arr[mid];
					}
					else
						return arr[mid-1];	
				}
				else
					r=mid-1;
			}
			else {
				if(arr[mid+1]>k) {
					int x1=arr[mid+1]-k;
					int x2=k-arr[mid];
					
					if(x1<x2)
						return arr[mid+1];
					else
						return arr[mid];
				}
				else
					l=mid+1;
			}
		}
		
		return -1;
	}

}
