package hashing;

import java.util.HashSet;
import java.util.Set;

public class intersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,10,15,5,10};
		int b[] = {15,5,5,10,4};
		
		Set <Integer> set = new HashSet<>();
		
//		Time Complexity -- O(n*n);
//		for(int i=0; i<5; i++) {
//			int ele=a[i];
//			for(int j=0; j<3; j++) {
//				if(ele==b[j])
//					set.add(ele);
//			}
//		}
		
		//Time complexity -- O(n);
		for(int ele:a) {
			set.add(ele);
		}
		
		int count=0;
		for(int i=0; i<b.length; i++) {
			if(set.contains(b[i])) {
				count++;
				set.remove(b[i]);
			}
		}
		
		System.out.println(count);
	}

}
