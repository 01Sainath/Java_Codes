import java.util.Scanner;

public class interstingArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		while(T-->0) {
			int N = input.nextInt();
			
			int arr[] = new int[N];
			
			for(int i=0; i<N; i++) {
				arr[i] = input.nextInt();
			}
			int K = input.nextInt();
			
			int i=0;
			int j=N-1;
			
			while(i<j) {
				int sum = arr[i] + arr[j];
				
				if(sum == K) {
					System.out.println(i+" "+j);
					break;
				}
				else if(sum < K)
					i = i+1;
				else
					j = j-1;
			}
			if(i==j)
				System.out.println("no answer");
		}
	}

}
