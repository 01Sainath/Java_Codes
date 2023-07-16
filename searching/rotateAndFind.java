package searching;

import java.util.Arrays;
import java.util.Scanner;

public class rotateAndFind {
	
	public static int binarySearch(int arr[], int l, int r, int data) {
		if(l>r)
			return -1;
		
		int mid=l+(r-l)/2;
		
		if(arr[mid]==data)
			return mid;
		if(arr[mid]>data)
			return binarySearch(arr,l,mid-1,data);
		return binarySearch(arr,mid+1,r,data);
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
			Arrays.sort(arr);
			System.out.println(binarySearch(arr,0,N-1,x));
		}
	}

}
