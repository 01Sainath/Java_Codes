import java.util.Scanner;

public class GCDbyIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		
		while(T-->0) {
			int N = input.nextInt();
			int P = input.nextInt();
			
			if(P>N) {
				int temp = P;
				P = N;
				N = temp;
			}
			
			for(int i=P; i>0; i--) {
				if(N%i==0 && P%i==0) {
					System.out.println(i);
					break;
				}
			}
		}
	}

}
