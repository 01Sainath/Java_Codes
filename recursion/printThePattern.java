package recursion;

import java.util.Scanner;

public class printThePattern {
	public static void print(int n) {
		System.out.print(n+" ");
		if(n<=0)
			return;
		print(n-5);
		System.out.print(n+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		
		while(T-->0) {
			int N = input.nextInt();
			print(N);
		}
	}

}
