package divideAndConquer;

import java.util.Scanner;

public class squareRootOptimised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		
		System.out.println(squareRoot(n));
		
	}
	
	static int squareRoot( int n) {
		
		if(n==0 || n==1) {
			return n;
		}
		int low=1;
		int high=n/2;
		int ans =0;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(mid*mid == n) {
				return mid;
			}
			else if(mid*mid < n) {
				ans=mid;
				low=mid+1;
			}
			else
				high=mid-1;
		}
		
		return ans;
		
	}

}
