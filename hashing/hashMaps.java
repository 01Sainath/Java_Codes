package hashing;

import java.util.HashMap;

public class hashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <String,String> people = new HashMap<>();
		
		people.put("Raj", "simran");
		people.put("Ross", "Rachel");
		people.put("Chandler", "Monica");
		people.put("Ted", "Tracy");
		
//		System.out.println(people.get("Ted"));
		
//		for(String i:people.values())
//			System.out.println(i);
		
		for(String i:people.keySet())
			System.out.println("key: "+ i +" Value: "+people.get(i));
	}

}
