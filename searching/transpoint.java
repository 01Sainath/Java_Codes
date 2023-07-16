package searching;

import java.util.Scanner;

public class transpoint {
	public static int findOne(int arr[], int l, int r) {
		if(l>r)
			return -1;
		
		int mid=l+(r-l)/2;
		
		if(arr[mid]==1 && (mid==0 || arr[mid-1]==0)) {
			return mid;
		}
		else if(arr[mid]==0)
			return findOne(arr,mid+1,r);
		
		else
			return findOne(arr,l,mid-1);
		
	}
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
			
			System.out.println(findOne(arr,0,n-1));
		}
	}

}
