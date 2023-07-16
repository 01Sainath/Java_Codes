import java.util.Scanner;

public class onePattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N=1;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(N+" ");
			}
			System.out.println();
		}

	}

}
