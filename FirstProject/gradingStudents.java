import java.util.Scanner;

public class gradingStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int grades[]=new int[n];
		
		for(int i=0; i<n; i++) {
			grades[i]=input.nextInt();
		}
		
		grading(grades);
		
		for(int i=0; i<n; i++) {
			System.out.println(grades[i]);
		}
	}

	private static int[] grading(int[] grades) {
		// TODO Auto-generated method stub
		for(int i=0; i<grades.length; i++) {
			if((grades[i]>37) && (((grades[i]+2)%5==0) || ((grades[i]+1)%5==0))) {
				if((grades[i]+1)%5==0)
					grades[i]+=1;
				if((grades[i]+2)%5==0)
					grades[i]+=2;
			}	
		}
		return grades;
	}

}
