import java.util.Scanner;

public class scalerMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int M=input.nextInt();
		int N=input.nextInt();
		int K=input.nextInt();
		
		int array[][]= new int[M][N];
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				array[i][j]=input.nextInt();
			}
		}
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				array[i][j]=array[i][j]*K;
			}
		}
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}

	}

}
