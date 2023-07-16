package recursion;

import java.util.Scanner;

public class SumOfDigits {
	public static long sumDigits(long n) {
		return n == 0 ? 0 : n%10 + sumDigits(n/10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		
		while(T-->0) {
			long N = input.nextInt(); 
			System.out.println(sumDigits(N));
		}
		
	}

}
