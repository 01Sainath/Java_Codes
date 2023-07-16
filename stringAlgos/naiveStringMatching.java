package stringAlgos;

import java.util.Scanner;

public class naiveStringMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String s1 = input.nextLine();
		String s2 = input.nextLine();
	
		int counter=0;
		int limit = s1.length()-s2.length();
		
		for(int s=0; s<=limit; s++) {
			int i=s;int flag=0;
			for(int j=0; j<s2.length(); j++) {
				if(s1.charAt(i)!=s2.charAt(j))
					break;
				i++;flag++;
			}
			if(flag==s2.length())
				counter++;
		}
		 
		
		System.out.println(counter);
	}

}
