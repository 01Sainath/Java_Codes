package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class prepbuddyAndRobo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int T=input.nextInt();
		while(T-->0) {
			String N=input.next();
			
			char arr[]=N.toCharArray();
			
			Arrays.sort(arr);
			
			int A[]=new int[N.length()];
			
			for(int i=0; i<A.length; i++) {
				A[i]=arr[i]-48;
			}
			
			System.out.println(robo(A,A.length));
		}
	}

	public static String robo(int[] a, int n) {
		// TODO Auto-generated method stub
		for(int i=0; i<n-1; i++) {
			if(a[i+1]!=a[i]+1) {
				return "NO";
			}
		}
		return "YES";
	}

}
