import java.util.Scanner;

public class fitSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		while(T-->0) {
			int M = input.nextInt();
			int N = input.nextInt();
			
			System.out.println((M*N)/2);
		}
	}

}
