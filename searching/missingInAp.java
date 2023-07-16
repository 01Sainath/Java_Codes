package searching;

import java.util.Scanner;

public class missingInAp {

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
			int d=binarysearch(arr,0,N-1);
			float n=((float)N+1)/2;
			int sum=(int)(n*(2*arr[0]+N*d));
			
			int arrSum=0;
			for(int i=0; i<N; i++) {
				arrSum+=arr[i];
			}
			System.out.println(sum-arrSum);
		}
	}

	private static int binarysearch(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		int mid=(l+r)/2;
		
		int diff1=arr[mid]-arr[mid-1];
		int diff2=arr[mid+1]-arr[mid];
		
		if(diff1==diff2)
			return diff1;
		if(diff1<diff2)
			return diff1;
		return diff2;
		
	}

}
