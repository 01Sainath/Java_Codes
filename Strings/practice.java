import java.util.Scanner;

public class practice {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		
		int A[] = new int[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			A[i] = (int)str.charAt(i);
		}
		
		for(int res: A) {
			System.out.print(res+" ");
		}
	}

}
