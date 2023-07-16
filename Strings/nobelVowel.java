import java.util.Scanner;

public class nobelVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		
		int T=input.nextInt();
		
		while(T-->0) {
			String S = input.next();
			int n = S.length();
			Boolean flag = false;
			
			if(S.charAt(n-1)=='a' || S.charAt(n-1)=='e' ||S.charAt(n-1)=='i' ||S.charAt(n-1)=='o' ||S.charAt(n-1)=='u' ||S.charAt(n-1)=='n') {
				flag = true;
			}
			
			if(flag) {
				for(int i=0; i<n-1; i++) {
					if(S.charAt(i)=='a'||S.charAt(i)=='e'||S.charAt(i)=='i'||S.charAt(i)=='o'||S.charAt(i)=='u'||S.charAt(i)=='n') {
						continue;
					}
					else {
						if(i<n-1 && (S.charAt(i+1)=='a' || S.charAt(i+1)=='e' ||S.charAt(i+1)=='i' ||S.charAt(i+1)=='o' ||S.charAt(i+1)=='u')) {
							continue;
						}
						else {
							flag = false;
							break;
						}
					}	
				}
			}
			if(flag)
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
		
	}
}



