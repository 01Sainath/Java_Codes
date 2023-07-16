import java.util.Scanner;

public class boxesAndToys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		int arr[][] = new int[N][2];
		int counter = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j]= input.nextInt();
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<1; j++) {
				if((arr[i][j+1]-arr[i][j]) >= 2)
					counter++;
			}
		}
		
		System.out.println(counter);
	}

}
