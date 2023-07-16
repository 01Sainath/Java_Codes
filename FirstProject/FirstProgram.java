import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			int number;
			
			System.out.println("Number: ");
			number=sc.nextInt();
			
			int result;
			result= number%10;
			
			System.out.println("Last Digit of "+number+" is "+result);
		}
}
