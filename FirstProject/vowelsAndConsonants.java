import java.util.Scanner;

public class vowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		
		while(T-->0) {
			int ch;
			int vowel=0;
			int consonant=0;
			String str = input.next();
			int vowels[] = {65,69,73,79,85};
			
			int n = vowels.length; 
			for(int i=0; i<str.length(); i++) {
				ch = str.charAt(i);
				int flag=0;
				for(int j=0; j<n; j++) {
					if(ch == vowels[j]) {
						vowel++;
						flag=flag+1;
					}
				}
				if(flag==0)
					consonant++;	
			}
			
			System.out.println(vowel+" "+consonant);
		}
	}

}
