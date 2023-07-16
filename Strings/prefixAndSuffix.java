import java.util.Scanner;

public class prefixAndSuffix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		int n = s.length();
		//Prefixes
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
		
		for(int i=n-1; i>=0; i--) {
			for(int j=i; j<n; j++) {
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}

}
