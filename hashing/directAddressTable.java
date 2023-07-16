package hashing;

import java.util.Arrays;

public class directAddressTable {
	
	public static void main(String[] args) {
		int arr[] = {1,5,4,2,6,2,1,3,6,4,3,4,3,2};
		Arrays.sort(arr);
		
		int freq[] = new int[arr[arr.length-1]+1];
		
		for(int i=0; i< arr.length; i++) {
			freq[arr[i]]++;
		}
		
		for(int res:freq) {
			System.out.println(res);
		}
	}
}
