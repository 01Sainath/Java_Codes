package recursion;

public class recursion1 {
	public static void print(int n) {
		if(n<0)
			return;
		System.out.println(n);
		print(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(3);
	}

}
