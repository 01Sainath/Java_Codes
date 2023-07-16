import java.util.Scanner;

public class shoppingCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		int a[][] = new int[N][2];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<2; j++) {
				a[i][j] = input.nextInt();
			}
		}
		
		for(int i=0; i<N; i++) {
			float res = a[i][0]*a[i][1];
			if(a[i][0] > 100) {
				System.out.println(res-(0.2*res));
			}
			else
				System.out.printf("%.2f",res);	
		}
	}

}
