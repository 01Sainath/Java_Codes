package randomProblems;

import java.util.Scanner;

public class deliotte1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int A=input.nextInt();
		int B=input.nextInt();
		
		System.out.println(solution(A,B));
	}

	public static int solution(int A, int B) {
		// TODO Auto-generated method stub
		int N=A*B;
//		ArrayList <Integer> list = new ArrayList<>();
		
		int counter=0;
		
		while(N!=0) {
			if(N%2==1) {
				counter++;
			}
			N=N/2;
		}
		
//		for(int i=0; i<list.size(); i++) {
//			if(list.get(i)==1) {
//				counter++;
//			}
//		}
		
		return counter;
	}

}
