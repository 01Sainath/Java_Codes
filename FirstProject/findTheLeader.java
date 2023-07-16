import java.util.Scanner;

public class findTheLeader {
    public void Leader (int arr[], int n) {
    	int max = arr[n-1];
    	System.out.print(max+" ");
    	
    	for(int i = n-2; i>=0; i--) {
    		if(max<=arr[i]) {
    			max = arr[i];
    			System.out.print(arr[i]+" ");
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		
		while(T-->0) {
			
			int N = input.nextInt();
			int A[] = new int[N];
			
			for(int i=0; i<N; i++) {
				A[i] = input.nextInt();
			}
			
			findTheLeader lead = new findTheLeader();
			
			lead.Leader(A, N);
			
		}
	}

}
