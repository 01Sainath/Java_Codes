import java.util.Scanner;

public class firstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		int flag = 0;
		int freq[] = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			freq[str.charAt(i)-97]++;
		}
		for(int i=0; i<str.length(); i++) {
			if(freq[str.charAt(i)-97] == 1) {
				System.out.println(str.charAt(i));
				flag = 1;
				break;
			}	
		}
		if(flag != 1)
			System.out.println(-1);
	}

}
