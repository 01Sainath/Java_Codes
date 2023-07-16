import java.util.Scanner;
public class multiplicationOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T=input.nextInt();
		
		while(T-->0) {
			
			int M=1,N=input.nextInt();
			
			int numbers[] = new int[N];
			
			for(int i=0; i<N; i++) {
				numbers[i]=input.nextInt();
			}
			
			for(int j=0; j<N; j++) {
				M=M*numbers[j];
			}
		}

	}

}
