import java.util.Scanner;

public class twoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
//		int marks[][] = {
//				{5,1,1,8,0},
//				{6,3,2,1,2},
//				{1,2,3,4,5},
//				{5,3,2,1,4},
//				{0,9,8,7,6}				
//		};
		int r=input.nextInt();
		int c=input.nextInt();
		
		int numbers[][] = new int[r][c];
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				numbers[i][j]=input.nextInt();
			}
		}
			
		for(int a=0; a<r; a++) {
			for(int b=0; b<c; b++) {
			System.out.print(numbers[a][b]+" ");
			}
			System.out.println();
		}
	}

}
