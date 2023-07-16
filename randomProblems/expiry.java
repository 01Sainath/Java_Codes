import java.util.*;

public class expiry {
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        while(T-->0){

            float N = input.nextInt();
            float M = input.nextInt();
            float K = input.nextInt();

            if(N <= M*K){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }

        input.close();
    }
}
