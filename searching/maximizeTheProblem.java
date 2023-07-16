package searching;

import java.util.Scanner;

public class maximizeTheProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int k=input.nextInt();
		k=240-k;
		
		System.out.println(problem(n,k));
	}

	public static int problem(int n, int k) {
		// TODO Auto-generated method stub
		int time=0;
		int problems=0;
		
		for(int i=1; i<=n; i++) {
			if(time+(i*5)<=k) {
				time+=i*5;
				problems++;
			}
		}
		return problems;
	}

}
