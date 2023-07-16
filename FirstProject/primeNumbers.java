import java.util.Scanner;

public class primeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		while(T-->0) {
			int N = input.nextInt();
			boolean flag = true;
			
			for(int i=2; i<N; i++) {
				if(N%i==0) {
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		
	}

}
