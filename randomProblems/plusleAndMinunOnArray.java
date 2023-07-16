package randomProblems;

import java.util.Scanner;

public class plusleAndMinunOnArray {

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
			
			for(int i=0; i<N; i++) {
				if(A[i]<0)
					A[i]=A[i]*-1;
			}
			
			int sum =sum(A[0],A);
			
			for(int j=N-1; j>0; j--) {
				for(int i=0; i<j; i++) {
					
					int temp=A[i];
					A[i]=A[j];
					A[j]=temp;
					
					int tempSum=sum(A[0],A);
					if(tempSum>sum)
						sum=tempSum;
					
					int temp1=A[i];
					A[i]=A[j];
					A[j]=temp1;
				}
			}
			System.out.println(sum);
		}
		
	}
	
	public static int sum(int S, int a[]) {
		for(int i=0; i<a.length-1; i++) {
			if(i%2==0) 
				S=S-a[i+1];
			
			else
				S=S+a[i+1];
		}
		
		return S;
	}

}
