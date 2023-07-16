
public class Strings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Sainath";
		String s1 = s.substring(0,4);    //0 to 2
		String s2 = s1.replace('n','e');
		
		System.out.println(s2);
		
		char ch = "Sainath".charAt(0);
		
		System.out.println(ch);
		
		char buf[] = new char[3];
		s.getChars(0, 3, buf, 0);
		
		System.out.println(buf[2]);
	}

}
