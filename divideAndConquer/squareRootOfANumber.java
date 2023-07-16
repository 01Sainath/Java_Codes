package divideAndConquer;

import java.util.Scanner;

public class squareRootOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int i=0;
		while(i*i<=n) {
			i++;
		}
		System.out.println(i-1);
	}

}
