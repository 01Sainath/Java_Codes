
public class testing {

		
////		for (int i = 0; i<=127; System.out.print(" "+ i++));
//		int sum = 0;
//		 for (int i = 0, j = 0; i < 5 & j < 5; i++, j = i + 1)
//		 sum += i;
//		 System.out.println(sum);
		
		static class Company{
			 public Company(){
			  System.out.print("PrepBytes");
			 }
			}
			static public class Course extends Company{
			 public Course(){
			  this("Provides");
			  System.out.print("Pinnacle");
			 }
			public Course(String s){
			 System.out.print(s);
			}
			}
			public static void main(String[] args){
			 new Course("Zenith");
			}
			

}
