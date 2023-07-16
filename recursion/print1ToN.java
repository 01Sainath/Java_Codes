package recursion;

import java.util.Scanner;

public class print1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		print(n);
	}

	public static void print(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return;
		print(n-1);
		System.out.print(n+" ");
	}

}
