package randomProblems;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(2);
		list.add(4);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}

}
