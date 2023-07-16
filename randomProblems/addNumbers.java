import java.util.*;

public class addNumbers {
    public static void main(String[]args){
        Scanner input  = new Scanner(System.in);
        int t =input.nextInt();

        while(t>0){
            String str = input.next();

            int sum = 0;
            for(int i=0; i<str.length(); i++){
                int num = str.charAt(i) - 48;
                sum+=num;
            }
    
            System.out.println(sum);

            t--;
        }
        

    }
}
