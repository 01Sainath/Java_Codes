package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class findTheMisplacedElements {

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
			
			int copy[]=Arrays.copyOf(arr, N);
			
			Arrays.sort(copy);
			
			int counter=0;
			
			for(int i=0; i<N; i++) {
				if(arr[i]!=copy[i])
					counter++;
			}
			
			System.out.println(counter);
		}
	}

}
