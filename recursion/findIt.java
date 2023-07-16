package recursion;

import java.util.Scanner;

public class findIt {
	public static long fun(int x, int n) {
		if(n==0)
			return 1;
		if(x==0)
			return 0;
		if(n%2==0) {
			return fun(x,n/2) * fun(x,n/2);
		}
		else
			return fun(x,n/2)*fun(x,n/2)*x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number:");
		int x=input.nextInt();
		System.out.print("Enter power:");
		int n=input.nextInt();
		System.out.println(fun(x,n));
		
		input.close();
	} 

}
