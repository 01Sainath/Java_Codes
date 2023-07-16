package sorting;

import java.util.Scanner;

public class powerSetOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		String str=input.next();
		
//		System.out.println(str);
		
		String str1="";
		func(str,0,str1+str.charAt(0));
		func(str,1,str1+str.charAt(1));
		func(str,2,str1+str.charAt(2));
	}

	public static void func(String str, int i, String str1) {
		// TODO Auto-generated method stub
		System.out.println(str1);
		if(i==str.length()-1)
			return;
		func(str,i+1,str1+str.charAt(i+1));
//		func(str,i+1,str1+str.charAt(i));
	}

}
