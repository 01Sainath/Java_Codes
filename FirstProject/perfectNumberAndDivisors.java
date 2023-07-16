import java.util.Scanner;

public class perfectNumberAndDivisors {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int T=input.nextInt();
		while(T-->0) {
			
			int sum=0,N=input.nextInt();
			
			for(int i=1; i<N; i++) {
				if(N%i==0)
					sum=sum+i;
			}
			if(sum==N)
				System.out.println("true");
			else
				System.out.println("false");
			
		}

	}

}
