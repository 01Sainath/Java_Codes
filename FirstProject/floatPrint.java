import java.util.Scanner;

public final class floatPrint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float N,M;
		
		N=sc.nextFloat();
		M=sc.nextFloat();
		
		System.out.printf("%.2f ",N);
		System.out.printf("%.2f",M);

	}

}
