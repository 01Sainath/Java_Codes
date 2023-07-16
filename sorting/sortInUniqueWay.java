package sorting;

import java.util.Scanner;

public class sortInUniqueWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int T=input.nextInt();
		while(T-->0) {
			int N=input.nextInt();
			
			int A[]=new int[N];
			for(int i=0; i<N; i++) {
				A[i]=input.nextInt();
			}
			
			System.out.println(unique(A,0,N-1));
		}
	}

	public static int unique(int[] a, int lb, int ub) {
		// TODO Auto-generated method stub
		int counter=0;
		for(int i=lb; i<ub; i++) {
			if(a[i]>a[i+1])
				counter++;
		}
		
		if(counter==0)
			return (ub-lb)+1;
		int mid=(lb+ub)/2;
		int left=unique(a,lb,mid);
		int right=unique(a,mid+1,ub);
		
		if(left>right)
			return left;
		return right;
	}

}
