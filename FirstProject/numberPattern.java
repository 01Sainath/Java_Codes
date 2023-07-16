import java.util.Scanner;

public class numberPattern {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    String ch=input.next();
		
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
