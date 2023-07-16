import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class stringPermutations {
    static ArrayList<String> ans;
    static int counter=0;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        while(t-->0){
            ans = new ArrayList<>();
            counter=0;
            String s = input.next();
            int n = s.length();

            System.out.println();
            ans = permutation(s,n,0);

            Collections.sort(ans);
            
            for(String ele: ans)
                System.out.print(ele+" ");

            System.out.println(counter);
        }
    }

    private static ArrayList<String> permutation(String s, int n, int i){
        if(i==n-1){
            ans.add(s);
            counter++;
        }
        for(int j=i; j<n; j++){
            s = swap(s,i,j);
            permutation(s,n,i+1);
            s = swap(s,i,j);
        }

        return ans;
    }

    private static String swap(String s, int i, int j) {
        StringBuilder sb = new StringBuilder(s);

        sb.setCharAt(i,s.charAt(j));
        sb.setCharAt(j,s.charAt(i));

        String str = new String(sb);
        return str;
    }
}
