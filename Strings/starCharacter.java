import java.util.Arrays;
import java.util.Scanner;

public class starCharacter {
	public static String removeDuplicate(char str[], int n)
    {
        // Used as index in the modified string
        int index = 0;
 
        // Traverse through all characters
        for (int i = 0; i < n; i++)
        {
 
            // Check if str[i] is present before it
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
 
            // If not present, then add it to
            // result.
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int T=input.nextInt();
		while(T-->0) {
			int N=input.nextInt();
			
			String A[]=new String[N];
			int counter=0;
			for(int i=0; i<N; i++) {
				A[i]=input.next();
			}
//			for(String res: A) {
//				System.out.println(res);
//			}
			
			char s[] = A[0].toCharArray();
	        int n = s.length;
	        String str=removeDuplicate(s, n);
//			System.out.println(str);
			
			for(int i=0; i<str.length(); i++) {
				int flag=0;
				for(int j=1; j<A.length; j++) {
					String str1=new String(A[j]);
					
					int index=str1.indexOf(str.charAt(i));
					
					if(index!=-1)
						flag++;
				}
				if(flag==N-1)
					counter++;
			}
			
			System.out.println(counter);
		}
	}

}
