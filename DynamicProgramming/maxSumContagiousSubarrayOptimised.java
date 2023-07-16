import java.util.Scanner;

public class maxSumContagiousSubarrayOptimised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = input.nextInt();
		}
		
		int max = 0;
		int maxSoFar = 0;
		
		for(int i=0; i<n; i++) {
			maxSoFar = Math.max(maxSoFar+arr[i], arr[i]);
			
			if(maxSoFar>max)
				max=maxSoFar;
		}
		
		System.out.println(max);
	}

}
