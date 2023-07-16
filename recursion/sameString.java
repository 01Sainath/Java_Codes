package recursion;

import java.util.Scanner;

public class sameString {
	public static Boolean reverse(String str, int i) {
		if(i>str.length()/2) {
			return true;
		}
		
		return str.charAt(i) == str.charAt(str.length()-1-i) && reverse(str,i+1);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		while(T-->0) {
			String str = input.next();
			Boolean ans = false;
			if(reverse(str,0))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

}
