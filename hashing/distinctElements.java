package hashing;

import java.util.Scanner;

public class distinctElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Time complexity -- O(n)
		//Space complexity -- O(n)
		Scanner input = new Scanner(System.in);
		
		int n=input.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=input.nextInt();
		}
		
		int max = arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		
		int freq[] = new int[max+1];
		
		for(int i=0; i<n; i++) {
			freq[arr[i]]++;
		}
		
		int counter=0;
		for(int i=0; i<freq.length; i++) {
			if(freq[i]!=0) {
				counter++;
			}
		}
		
		System.out.println(counter);
	}

}
