package divideAndConquer;

import java.util.Scanner;

public class closestElement {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n= input.nextInt();
		int k;
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=input.nextInt();
		}
		k=input.nextInt();
		int flag=0;
		
		if(k<arr[0]) {
			System.out.println(arr[0]);
		}
		else {
			for(int i=0; i<n; i++) {
				if(arr[i]>k) {
					if(arr[i]-k > k-arr[i-1]) {
						System.out.println(arr[i-1]);
						break;
					}
					else {
						System.out.println(arr[i]);
						break;
					}
				}
				flag++;
			}
		}
		
		if(flag==n) {
			System.out.println(arr[n-1]);
		}
	}

}
