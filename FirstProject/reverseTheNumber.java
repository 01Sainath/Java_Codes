import java.util.Scanner;

public class reverseTheNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X,reversedNumber=0;
		X=sc.nextInt();
		
		while(X!=0) {
			
			reversedNumber=reversedNumber+X%10;
			if(X>=10)
				reversedNumber=reversedNumber*10;
			X=X/10;
		}
		System.out.println(reversedNumber);
		
	}

}
