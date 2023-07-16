import java.util.ArrayList;
import java.util.Collections;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(1);
		
		System.out.println(list);
		
		System.out.println(list.get(1));
		
		list.set(3, 2);
		
		System.out.println(list);
		
		list.add(1);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);

		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
	}
}
