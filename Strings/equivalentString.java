import java.util.*;

public class equivalentString {
	   public static boolean Equivalent(String a, String b, int n) {
			
		   	if(a.equals(b))
		   		return true;
		   	
			String a1 = a.substring(0,n/2);
			String a2 = a.substring(n/2);
			
			String b1 = b.substring(0,n/2);
			String b2 = b.substring(n/2);
			
			if(a1.length()%2 != 0 ) {
				if(a1.equals(b1) && a2.equals(b2))
					return true;
				else if(a1.equals(b2) && a2.equals(b1))
					return true;
				else 
					return false;
			}
			else {
				if(a1.equals(b1) && a2.equals(b2))
					return true;
				else if(a1.equals(b2) && a2.equals(b1))
					return true;
				else 
					return (Equivalent(a1,b2,n/2) && Equivalent(a2,b1,n/2)) || (Equivalent(a1,b1,n/2) && Equivalent(a2,b2,n/2)) ;
			}	
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			
			String s1 = input.next();
			String s2 = input.next();
			int n = s1.length();

			if(Equivalent(s1,s2,n))
				System.out.println("YES");
			else
				System.out.println("NO");
	}
}
