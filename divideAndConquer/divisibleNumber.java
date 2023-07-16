package divideAndConquer;

import java.util.Scanner;

public class divisibleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		while(t-->0) {
			
			int a = input.nextInt();
			int b = input.nextInt();
			int k = input.nextInt();
			
			System.out.println(luckyNumber(a,b,k));
		}
	}
	
	static int luckyNumber(int a, int b, int k) {
		
		int counter=0;
		int i=1;
		while(counter<k) {
			if(i%a==0 || i%b==0) {
				counter++;
			}
			i++;
		}
		
		return i-1;
	}

}
