import java.util.Scanner;

public class duplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T =input.nextInt();
		
		while(T-->0) {
			
			String str=input.next();
			int flag=0;
			int freq[]=new int[26];
			
			for(int i=0; i<str.length(); i++) {
				freq[str.charAt(i)-97]++;
			}
			
			for(int i=0; i<26; i++) {
				if(freq[i]>1) {
					char ch = (char)(i+97);
					System.out.print((ch+"="+freq[i]+" "));
				}
					
				else
				 	flag++;
			}
			if(flag==26)
				System.out.println(-1);
		}
	}

}
