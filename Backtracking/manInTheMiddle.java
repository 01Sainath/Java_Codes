import java.util.Scanner;

public class manInTheMiddle {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String str = input.next();
        StringBuilder sb = new StringBuilder(str);

        backTrack(str,sb,0);
    }

    private static void backTrack(String str, StringBuilder sb, int i){
        if(i==str.length()){ 
            System.out.println(sb);
            return;
        }

        if(Character.isAlphabetic(str.charAt(i))){
            if(Character.isUpperCase(str.charAt(i))){
                sb.setCharAt(i,Character.toLowerCase(str.charAt(i)));
            }
            else{
                sb.setCharAt(i,Character.toUpperCase(str.charAt(i)));
            }
            backTrack(str,sb,i+1);
            sb.setCharAt(i,str.charAt(i));
        }
        backTrack(str,sb,i+1);
    }
}
