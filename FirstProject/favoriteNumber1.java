import java.util.Scanner;

public class favoriteNumber1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T;
		T=sc.nextInt();
		
		while(T-->0) {
			
			int N,counter=0;
			N=sc.nextInt();
//			sc.close();
			
			while(N!=0) {
				
				if(N%10==5)
					counter++;
				N=N/10;
			}
			System.out.println(counter);
		}

	}

}
