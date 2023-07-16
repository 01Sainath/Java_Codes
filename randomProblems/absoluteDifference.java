package randomProblems;

import java.util.Scanner;

public class absoluteDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		while(t-->0) {
			
			int n = input.nextInt();
			
			int arr[][] = new int[n][n];
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++){
					arr[i][j] = input.nextInt();
				}
			}
			
//			for(int i=0; i<n; i++) {
//				for(int j=0; j<n; j++){
//					System.out.print(arr[i][j]+" ");
//				}
//				System.out.println();
//			}
			int sum1 = 0;
			for(int i=0; i<n; i++) {
				sum1+=arr[i][i];
			}
			
			int i=0;
			int j=n-1;
			int sum2=0;
			
			while(j>=0) {
				sum2+=arr[i][j];
				i++;
				j--;
			}
			
			System.out.println(Math.max(sum2, sum1)-Math.min(sum2, sum1));
			
		}
	}

}
