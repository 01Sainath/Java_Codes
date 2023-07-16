package hashing;

import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet <Integer> s = new HashSet<>();
		
		s.add(10);
		s.add(6);
		s.add(9);
		s.add(5);
		s.add(1);
		
		System.out.println(s);
		
		for(int i=1; i<=10; i++) {
			if(s.contains(i)) 
				System.out.println(i+" is present.");
			else
				System.out.println(i+" is not present.");
		}
	}

}
