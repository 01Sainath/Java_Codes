import java.util.Scanner;

public class vPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		char ch = input.next().charAt(0);
		
		int lines=5;
		int space = (lines*2)-2;
		
		for(int i=1; i<=5; i++) {
			
			for(int L=1; L<=i; L++) {
				System.out.print(L);
			}
			
			for(int S=1; S<=space; S++) {
				System.out.print(" ");
			}
			
			for(int R=i; R>0; R--) {
				System.out.print(R);
			}
			
			space=space-2;
			System.out.println();
		}

	}

}
