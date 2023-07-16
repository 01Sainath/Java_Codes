package recursion;

public class reverseAString {
	
	public static char swap(char a,char b) {
		char temp;
		temp = a;
		a =b;
		b = temp;
		return a;
	}
	public static void reverse(char str[]) {
		int n = str.length;
		
		for(int i=0; i<n/2; i++) {
			swap(str[i],str[n-1-i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = {'s','a','i','n','a','t','h'};
		reverse(arr);
		String s = new String(arr);
		System.out.println(s);
	}

}
