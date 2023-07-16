import java.util.Scanner;

public class favoriteNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int t;
		t=sc.nextInt();
		
		while(t-->0) {
			
			int n;
			n=sc.nextInt();
			
			int rem,count=0;
			
			while(n!=0) {
				
				rem = n%10;
				if(rem==5)
					count++;
				n=n/10;
			}
			System.out.println(count);
			
		}

	}

}
