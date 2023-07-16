import java.util.Scanner;

public class chatursExamPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T=input.nextInt();
		while(T-->0) {
			String str = input.next();
			int counter=0;
			int paper[] = new int[str.length()];
			int n = paper.length;
			
			for(int i=0; i<str.length(); i++) {
				paper[i] = (int)str.charAt(i);
			}
			
			for(int i=0; i<n/2; i++) {
				if(paper[i]==paper[n-1-i])
					continue;
				else if(paper[i]<paper[n-1-i])
					counter += paper[n-1-i]-paper[i];
				else
					counter+= paper[i]-paper[n-1-i];
			}
			
			System.out.println(counter);
		}
		
	}

}
