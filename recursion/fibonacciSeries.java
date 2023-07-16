package recursion;

import java.util.*;

public class fibonacciSeries {
	public static void printFib(int a, int b, int n) {
		if(n<=1) {
			if(n!=0)
				System.out.print(a+b+" ");
			return;
		}
		int c = a+b;
		System.out.print(c+" ");
		printFib(b,c,n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int  T= input.nextInt();
		while(T-->0) {
			int a = 1, b=1;
			int n= input.nextInt(); 
			if (n<=1) {
				System.out.println(n);
			}
			else{
				System.out.print(a+" "+b+" ");
				printFib(a,b,n-2);
			}
				
		}
		
	}

}
