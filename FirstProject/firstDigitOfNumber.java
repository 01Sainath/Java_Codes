import java.util.Scanner;

public class firstDigitOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T;
		T=sc.nextInt();
		
		while(T-->0) {
			
			int N;
			N=sc.nextInt();
			
			while(N>=10) {
				
				N=N/10;
			}
			System.out.println(N);
		}
	}

}
