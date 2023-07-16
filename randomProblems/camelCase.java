package randomProblems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class camelCase {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        Set <Character> letters = new HashSet<>();

        for(int i=0; i<26; i++){
            char c = (char)(65+i);
            letters.add(c);
        }
        int counter=1;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(letters.contains(ch))
                counter++;
        }
        System.out.println(counter);
    }
}
