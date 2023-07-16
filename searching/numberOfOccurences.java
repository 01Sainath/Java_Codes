package searching;

import java.util.Scanner;

public class numberOfOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int T=input.nextInt();
		while(T-->0) {
			int n=input.nextInt();
			int counter=0;
			char A[]=new char[n];
			for(int i=0; i<n; i++) {
				A[i]=input.next().charAt(0);
			}
			
			for(char res: A) {
				if(res=='x')
					counter++;
			}
			
			System.out.println(counter);
		}
		
	}

}
