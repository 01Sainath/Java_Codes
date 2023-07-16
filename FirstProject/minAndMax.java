import java.util.Arrays;
import java.util.Scanner;

public class minAndMax {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int T=input.nextInt();
		
		while(T-->0) {
			
			int N=input.nextInt();
			
			int numbers[]= new int[N];
			
			for(int i=0; i<N; i++) {
				numbers[i]=input.nextInt();
			}
			
			Arrays.sort(numbers);
			
			System.out.print(numbers[0]+" ");
			System.out.println(numbers[N-1]);
		}

	}

}
