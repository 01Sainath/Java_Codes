import java.util.Scanner;

public class tinaLovesA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		
		while(T-->0) {
			
			String S = input.next();
			int n = S.length();
			int counter=0;
			
			
			for(int i=0; i<n; i++) {
				if(S.charAt(i)=='a')
					counter++;
			}
			
			if(counter>(n/2))
				System.out.println(n);
			else
				System.out.println((2*(counter-1))+1);
		}
	}

}
