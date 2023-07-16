package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class sameSetOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int arr[] = new int[6];
		int brr[] = new int[6];
		
		for(int i=0; i<6; i++) {
			arr[i]=input.nextInt();
		}
		
		for(int i=0; i<6; i++) {
			brr[i]=input.nextInt();
		}
		
		HashMap <Integer,Integer> map = new HashMap<>();
		
//		Arrays.sort(arr);
//		Arrays.sort(brr);
		
//		int counter=0;
//		
//		for(int i=0; i<6; i++) {
//			if(arr[i]!=brr[i]) {
//				break;
//			}
//			else
//				counter++;
//		}
//		
//		if(counter==6) 
//			System.out.println("same set.");
//		else
//			System.out.println("not same");
		
		
	}

}
