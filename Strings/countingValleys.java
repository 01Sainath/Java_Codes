import java.util.Scanner;

public class countingValleys {
	
	public static int CountingValleys(int steps, String path) {
		
		int valleys=0;
		int position=0;
		int count[]=new int[steps];
		
		for(int i=0; i<steps; i++) {
			if(path.charAt(i)=='U') {
				position++;
			}
			else if(path.charAt(i)=='D') {
				position--;
			}
			
			count[i]=position;						
		}
		
		for(int i=0; i<steps; i++){
			if(count[i]==0) {
				if(count[i-1]<0)
					valleys++;
			}
		}
		
		return valleys;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int steps=input.nextInt();
		
		String str=input.next();
		
		System.out.println(CountingValleys(steps,str));
	}

}
