import java.util.Scanner;

public class fiboTopDown {
	
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
		if(arr[n]!=0) 
			return arr[n];
		return arr[n] = fib(n-1)+fib(n-2);
	}

}
