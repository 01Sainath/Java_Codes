import java.util.Scanner;

public class mixedInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		float M;
		String ch;
		
		N=sc.nextInt();
		M=sc.nextFloat();
		ch=sc.next();
		
		System.out.print(N+"$");
		System.out.printf("%.2f",M);
		System.out.print("$"+ch);
		

	}

}
