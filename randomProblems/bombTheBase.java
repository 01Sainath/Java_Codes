package randomProblems;

import java.util.Scanner;

public class bombTheBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int T=input.nextInt();
		while(T-->0) {
			int N=input.nextInt();
			int X=input.nextInt();
			
			int A[]=new int[N];
			for(int i=0; i<N; i++) {
				A[i]=input.nextInt();
			}
			
			int sum=N;
			for(int i=N-1; i>=0; i--) {
				if(A[i]<X) {
					break;
				}
				sum--;
			}
			
			System.out.println(sum);
		}
	}

}
