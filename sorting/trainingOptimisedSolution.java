package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class trainingOptimisedSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int T=input.nextInt();
		for(int t=1; t<=T; t++) {
			
			int N=input.nextInt();
			int P=input.nextInt();
			
			int A[]=new int[N];
			for(int i=0; i<N; i++) {
				A[i]=input.nextInt();
			}
			
			Arrays.sort(A);
			
			int prefix[]=new int[N];
			prefix[0]=A[0];
			for(int i=1; i<N; i++) {
				prefix[i]=prefix[i-1]+A[i];
			}

			int hours=0;
			int j=-1;
			for(int i=P-1; i<N; i++) {
				int sum=(P-1)*A[i];
				
				sum-=prefix[i-1];
				if(j>=0)
					sum+=prefix[j];
				if(i==P-1)
					hours=sum;
				if(sum<hours)
					hours=sum;
				j++;
			}
			
			System.out.println("Case #"+t+": "+hours);
		}
	}

}
