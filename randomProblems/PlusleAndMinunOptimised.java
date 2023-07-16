package randomProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PlusleAndMinunOptimised {

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
			
			ArrayList odd=new ArrayList();
			ArrayList even=new ArrayList();
			
			for(int i=0; i<N; i++) {
				if(i%2==0) 
					odd.add(A[i]);
				else
					even.add(A[i]);
			}
			
			Collections.sort(odd);
			Collections.sort(even);
			
			int a=(int) odd.get(0);
			int b=(int) even.get(even.size()-1);
			
			int sum1 = sum+ 2*(b-a);
			
			if(sum1>sum)
				System.out.println(sum1);
			else
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
