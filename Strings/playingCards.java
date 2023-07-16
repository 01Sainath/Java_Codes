import java.util.Scanner;

public class playingCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		input.nextLine();
		while(T-->0) {
			
			String S = input.nextLine();
			String C = input.nextLine();
			
			
			Boolean flag = false;
			
			for(int i=0; i<S.length(); i++ ) {
				char s = S.charAt(i);
				for(int j=i; j<C.length(); j++) {
					if(s==C.charAt(j)) {
						flag = true;
					j=j+2;
					}
				}
			}
			
			if(flag)
				System.out.println("YES");
			else
				System.out.println("NO");
 		}
	}

}
