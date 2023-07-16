package recursion;

public class practice {
	public static int sum(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(9,4));
		
		System.out.println(reverse("Sainath"));
	}
	
	static String reverse(String str) {
		StringBuilder s = new StringBuilder(str);
		String ans = new String(s.reverse());
		
		return ans;
	}

}
