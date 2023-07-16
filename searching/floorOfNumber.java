package searching;

import java.util.Scanner;

public class floorOfNumber {
	public static int findFloor(int arr[], int l, int r, int data) {
		
		int mid=l+(r-l)/2;
		
		if(l>r || mid==arr.length-1)
			return -1;
		
		if(arr[mid]==data || (arr[mid]<data && arr[mid+1]>data))
			return mid;
		if(arr[mid]<data)
			return findFloor(arr,mid+1,r,data);
		return findFloor(arr,l,mid-1,data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int T=input.nextInt();
		while(T-->0) {
			int N=input.nextInt();
			int x=input.nextInt();
			
			int A[]=new int[N];
			for(int i=0; i<N; i++) {
				A[i]=input.nextInt();
			}
			
			System.out.println(findFloor(A,0,N-1,x));
		}
	}

}
