import java.util.*;

public class operationsOnMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int M=input.nextInt();
		int N=input.nextInt();
		
		int matrix1[][] = new int[M][N];
		int matrix2[][] = new int[M][N];
		
		int add[][] = new int[M][N];
		int mult[][] = new int[M][N];
		
		//Input Arrays
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				matrix1[i][j] = input.nextInt();
			}
		}
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				matrix2[i][j] = input.nextInt();
			}
		}
		
		// Addition
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				add[i][j] = matrix1[i][j] + matrix2[i][j];
				System.out.print(add[i][j]+" ");
			}
			System.out.println();
		}
		
		// Multiplication
		int res=0;
		for(int i=0;i<M;i++){
		      for(int j=0;j<N;j++){
		        for(int k=0;k<M;k++){
		        	res+=matrix1[i][k]*matrix2[k][j];
		        }
		        mult[i][j]=res;
		        res=0;
		        System.out.print(mult[i][j]+" ");
		      }
		      System.out.println();
		}
		
		
	}

}
