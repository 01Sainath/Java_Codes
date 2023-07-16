import java.util.Scanner;

public class nameInAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		
		while(T-->0) {
			
			String s = input.next();
			
			for(int i=0; i<s.length(); i++) {
				int ch = s.charAt(i);
				System.out.print(ch+" ");
			}
		}
	}

}
