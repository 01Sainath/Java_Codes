import java.util.Scanner;

public class slidingWindowApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		while(T-->0) {
			int N = input.nextInt();
			int K = input.nextInt();
			
			int arr[] = new int[N];
			
			for(int i=0; i<N; i++) {
				arr[i] = input.nextInt();
			}
			int current_sum =0;
			int max = -1;
			for(int i=0; i<K; i++) {
				current_sum += arr[i]; 
			}
			max = current_sum;
			
			for(int i=K; i<N; i++) {
				current_sum += arr[i] - arr[i-K];
				if(current_sum>max)
					max = current_sum;
			}
			
			System.out.println(max);
		}
	}

}
