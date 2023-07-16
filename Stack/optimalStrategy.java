import java.util.Scanner;

public class optimalStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		int A[] = new int[N];
		
		for(int i=0; i<N; i++) {
			A[i]=input.nextInt();
		}
		
//		System.out.println(X+" "+Y);
		
		int i=0;
		int j=N-1;
		
		while(i<N && j>=0 ) {
			int X = A[i];
			int Y = A[j];
			
			if(X>Y) {
				System.out.print(1+" ");
				j--;
			}
			
			if(Y>X) {
				System.out.print(2+" ");
				i++;
			}
			
			if(X==Y) {
				System.out.print(0+" ");
				i++;
				j--;
			}
			
		}
		
	}

}
