package hashing;

import java.util.HashSet;
import java.util.Set;

public class unionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {5,10,15,5};
		int B[] = {10,15,4,5};
		
		Set <Integer> set = new HashSet<>();
		
		for(int ele: A) {
			set.add(ele);
		}
		
		for(int ele: B) {
			set.add(ele);
		}
		
		System.out.println(set.size());
	}

}
