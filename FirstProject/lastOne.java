
import java.util.Scanner;
public class lastOne {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		
		while(T-->0) {
			int index=0, flag= 0;
			
			int N = input.nextInt();
			int A[] = new int[N];
			
			for(int i=0; i<N; i++) {
				A[i] = input.nextInt();
			}
			
			for(int j=0; j<N; j++) {
				if(A[j] == 1) {
					flag=1;
					index=j;
				}
			}
			if(flag==1)
				System.out.println(index);
			else
				System.out.println(-1);
		
		}
		
	}
}
