import java.util.*;

public class upperAndLowerTriangularMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int M = input.nextInt();
		int N = input.nextInt();
		
		int matrix[][] = new int[M][N];
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		
		int Lower[][] = new int[M][N];
		int Upper[][] = new int[M][N];
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(i<j)
					Lower[i][j] = 0;
				else
					Lower[i][j] = matrix[i][j];
			}
		}
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(i>j)
					Upper[i][j] = 0;
				else
					Upper[i][j] = matrix[i][j];
			}
		}
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(Lower[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();

		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(Upper[i][j]+" ");
			}
			System.out.println();
		}
	}

}
