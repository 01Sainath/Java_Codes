package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class training {

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
			
//			for(int res: A)
//				System.out.println(res);
			
			int hours=0;
			for(int i=0; i<=N-P; i++) {
				int max=A[P+i-1];
				int sum=0;
				for(int j=i; j<P+i; j++) {
					sum += max-A[j];
				}
				if(i==0)
					hours=sum;
				else {
					if(sum<hours)
						hours=sum;
				}
			}
			
			System.out.println("Case #"+t+": "+hours);
		}
		
		
		
	}

}
