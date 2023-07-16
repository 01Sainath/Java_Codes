package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class maximumChocolates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int T=input.nextInt();
		while(T-->0) {
			int N=input.nextInt();
			int arr[]=new int[N];
			
			for(int i=0; i<N; i++) {
				arr[i]=input.nextInt();
			}
			
			Arrays.sort(arr);
			
			int tina=0;
			for(int i=N-1; i>=0; i--) {
				tina+=arr[i];
				i--;
			}
			
			System.out.println(tina);
		}
	}

}
