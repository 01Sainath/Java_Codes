package recursion;

public class printNumbers {
	public static void sum(int n) {
		for(int i=n; i>0; i--) {
			System.out.print(i+" ");
		}
	}
	
	public static void sumRecursion(int n) {
		if(n==0)
			return;
		System.out.print(n+" ");
		sumRecursion(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(5);
		System.out.println();
		sumRecursion(5);
	}

}
