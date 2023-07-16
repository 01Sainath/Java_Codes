package divideAndConquer;

import java.util.Scanner;

public class divisibleNumberOptimised {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		while(t-->0) {
			
			long a = input.nextInt();
			long b = input.nextInt();
			long k = input.nextInt();
			
			long l = 0;
			long r = Long.MAX_VALUE;
			long lcm = (a*b)/gcd(a,b);
			long ans = 0;
			
			while(l<r) {
				long mid = (l+r)/2;
				
				ans = (mid/a) + (mid/b) - (mid/lcm);
				
				if(ans<k) 
					l = mid+1;
				else
					r = mid;
			}
			
			System.out.println(l);
		}
	}
	
	static long gcd(long a, long b) {
		
		if(b == 0) 
			return a;
		return gcd(b , a%b);
		
	}

}
