package randomProblems;

import java.util.Scanner;

public class stringProtocol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int T=input.nextInt();
		
		while(T-->0) {
			int N=input.nextInt();
			String s=input.next();
			
			int sum=1;
			int i=0;
			while(i<N-1) {
				if(s.charAt(i)==s.charAt(i+1))
					i+=2;
				else
					i+=1;
				sum+=1;
			}
			if(i==N)
				sum-=1;
			System.out.println(sum);
		}
		
	}

}
