package recursion;

import java.util.Scanner;

public class printReverseString {
	public static void reverse(String s, int i, int n) { 
		if(i==n)
			return;
		reverse(s,i+1,n);
		System.out.print(s.charAt(i));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		
		while(T-->0) {
			String S = input.next();
			int N= S.length();
			int I=0;
			
			reverse(S,I,N);
			
		}
	}

}
