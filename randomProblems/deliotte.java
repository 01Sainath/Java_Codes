package randomProblems;

import java.util.Scanner;

public class deliotte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		String S = input.next();

		
		System.out.println(solution(S));
	}
	
	public static int solution(String S) {
		char arr[] = S.toCharArray();
		
		int R=0;
		int L=0;
		
		int counter=0;
		
		for(int i=0; i<S.length(); i++) {
			if(arr[i]=='R') {
				R++;
			}
			else
				L++;
			
			if(R==L) {
				counter++;
				R=0;
				L=0;
			}
		}
		
		return counter;
		
	}

}
