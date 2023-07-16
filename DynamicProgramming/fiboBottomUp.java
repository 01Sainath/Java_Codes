import java.util.Scanner;

public class fiboBottomUp {
	
	static int arr[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		arr = new int[n+1];
		System.out.println(fib(n));
	}
	
	private static int fib(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		arr[0]=0;
		arr[1]=1;
		
		for(int i=2; i<=n; i++)
			arr[i] = arr[i-1]+arr[i-2];
		
		return arr[n];
	}
	
}
