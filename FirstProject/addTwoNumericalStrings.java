import java.util.Scanner;

public class addTwoNumericalStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s1 =input.next();
		String s2 = input.next();
		
		int sum=0;
		int carry=0;
		
		StringBuilder result = new StringBuilder();
		
		if(s1.length() >s2.length()) {
			String temp= s1;
			s1 = s2;
			s2 = temp;
		}
		s1 = new StringBuilder(s1).reverse().toString();
		s2 = new StringBuilder(s2).reverse().toString();
		
		int n1 = s1.length();
		int n2 = s2.length();
		
		for(int i=0; i<n1; i++) {

			sum = ((s1.charAt(i)-'0')+(s2.charAt(i)-'0')+carry);
			
			if(sum>9) {
				
				result.append((char)(sum%10+'0'));
			}
			else
				result.append((char)(sum+'0'));
			
			carry = sum/10;
					
		}
		
		for(int i=n1; i<n2; i++) {
			sum = ((s2.charAt(i)-'0')+carry);
			
			if(sum>9) {
				
				result.append((char)(sum%10+'0'));
			}
			else
				result.append((char)(sum+'0'));
			
			carry = sum/10;
		}
		
		if(carry>0)
			result.append(carry);
		
		result.reverse();
		
		System.out.println(result);
		
	}

}
