package randomProblems;
import java.util.*;

public class keyStrokes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int ascii = 96;
        HashMap <Character,Integer> map = new HashMap<>(26);
        for(int i=0; i<26; i++){
            ascii++;
            char key = (char)ascii;
            map.put(key,500);
        }
        for(int i=0; i<n; i++){
            char key = input.next().charAt(0);
            int value = input.nextInt();
            
            map.put(key,value);
        }
        
        String s = input.nextLine();
        String str = input.nextLine();
        // System.out.println(map);
        // System.out.println(str);

        for(int i=0; i<str.length(); i++){
            char key = str.charAt(i);
            // int value = map.get(key);
            if(key==' '){
                System.out.print(key);
            }
            else if(map.get(key)>0){
                System.out.print(key);
                map.put(key,map.get(key)-1);
            }
        }
    }
}
