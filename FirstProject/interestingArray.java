import java.util.Scanner;

public class interestingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		while(T-->0) {
			int N = input.nextInt();
			int flag=0;
			int A[] = new int[N];
			
			for(int i=0; i<N; i++) {
				A[i] = input.nextInt();
			}
			int K = input.nextInt();
				
			for(int j=N-1; j>0; j--) {
				for(int i=0; i<N; i++) {
					if(A[i]+A[j] == K) {	
						System.out.println(i+" "+j);
						flag++;
						break;
					}
				}
				if(flag == 1)
					break;
			}
			if(flag==0) {
				System.out.println("no answer");
			}
		}
	}

}
