package recursion;

import java.util.Scanner;

public class mikeAndBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		while(T-->0) {
			int N = input.nextInt();
			int zeros=0;
			int ones=0;
			
			StringBuilder str = new StringBuilder();
			String s = new String();
			while(N!=0) {
				str.append(N%2);
				if(N%2==0)
					zeros++;
				if(N%2==1)
					ones++;
				N=N/2;
			}
			str.reverse();
			
			func(ones, zeros, s);
		}
	}

	public static void func(int ones, int zeros, String s) {
		if(ones==0 && zeros==0) {
			System.out.print(s+" ");
			return;
		}	
		if(zeros>0) {
			func(ones, zeros-1, s+"0");
		}
		if(ones>0) {
			func(ones-1, zeros, s+"1");
		}
	}
}



