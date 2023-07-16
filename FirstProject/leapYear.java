import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int T;
		T=sc.nextInt();
		
		while(T-->0) {
			
			int N;
			N=sc.nextInt();
			
			if(N%4 == 0 && N%100 != 0 || N%400 == 0)
//			if(N%4 == 0 && N%400 == 0)
					System.out.println("Yes");
			else
				System.out.println("No");
			
		}
		
		
	}

}
