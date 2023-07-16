package recursion;

import java.util.Scanner;

public class GCD {
	public static void gcd(int n,int p,int i) {
		if(n%i==0 && p%i==0) {
			System.out.println(i);
			return;
		}
		gcd(n,p,i-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		
		while(T-->0) {
			int N = input.nextInt();
			int P = input.nextInt();
			
			if(P>N) {
				int temp = P;
				P = N;
				N = temp;
			}
			gcd(N,P,P);
			
		}
		input.close();
	}
}

