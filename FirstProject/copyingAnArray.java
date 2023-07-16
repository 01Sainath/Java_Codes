import java.util.Arrays;

public class copyingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks[] = {1,2,3,4,5,6};
		
//		int numbers[] = marks;
		
//		int numbers[] = Arrays.copyOf(marks,marks.length); 
		
		int numbers[] = new int[6];
		for(int i=0; i<marks.length; i++) {
			numbers[i]=marks[i];
		}
		
		System.out.println(numbers[1]);
		
	}

}
