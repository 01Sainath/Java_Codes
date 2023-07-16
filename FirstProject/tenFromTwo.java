import java.util.Scanner;

public class tenFromTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		while(T-->0) {
			int N = input.nextInt();
			
			if(N%10 != 5 && N%10 != 0)
				System.out.println("-1");
			else {
				if(N%10 == 5)
					System.out.println("1");
				else
					System.out.println("0");
			}
		}
	}

}
