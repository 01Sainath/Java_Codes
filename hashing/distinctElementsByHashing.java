package hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class distinctElementsByHashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n=input.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=input.nextInt();
		}
		
		Set <Integer> set = new HashSet<>();
		
		for(int ele:arr) {
			set.add(ele);
		}
		
		System.out.println(set);
		
	}

}
