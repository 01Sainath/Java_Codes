package recursion;

import java.util.Scanner;

public class recursiveSum {
	
	 public static int sum(int n) {
			if(n==1)
				return 1;
			return n+sum(n-1);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			
			int T = input.nextInt();
			while(T-->0) {
			  int n = input.nextInt();
			  System.out.println(sum(n));
			}
		}

}
