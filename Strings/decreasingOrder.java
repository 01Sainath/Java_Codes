import java.util.Arrays;
import java.util.Scanner;

public class decreasingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		
		while(T-->0) {
			
			String s = input.next();
			int ch;
			int arr[] = new int[s.length()];
			int n = s.length();
			char c;
			
			for(int i=0; i<n; i++) {
				ch = s.charAt(i);
				arr[i] = ch;
			}
			
			Arrays.sort(arr);
			
//			for(int i=0; i<s.length(); i++) {
//				System.out.print(arr[i]+" ");
//			}
			
			for(int i=n-1; i>=0; i--) {
				c = (char)(arr[i]);
				System.out.print(c);
			}
			
			System.out.println();
			
		}
	}

}
