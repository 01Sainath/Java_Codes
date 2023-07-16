import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X,sum=0;
		X=sc.nextInt();
		
		while(X>0) {
			
			sum = sum+X%10;
			X=X/10;
		}
		System.out.println(sum);
	}

}
