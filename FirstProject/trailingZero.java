import java.util.Scanner;

public class trailingZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		
		int A[]=new int[n];
		
		for(int i=0; i<n; i++) {
			A[i]=input.nextInt();
		}
		int counter=0;
		for(int i=n-1; i>=0; i--) {
			if(A[i]==0)
				counter++;
			else
				break;
		}
		System.out.println(counter);
	}

}
