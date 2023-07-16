package randomProblems;

import java.util.HashSet;
import java.util.Scanner;

public class pangrams {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        String str = new String(s.toUpperCase());

        HashSet <Character> set = new HashSet<>(26);

        int n=64;
        char c;
        for(int i=0; i<26; i++){
            n++; 
            c=(char)n;
            set.add(c);
        }

        for(int i=0; i<str.length(); i++){
            if(set.contains(str.charAt(i)))
                set.remove(str.charAt(i));
        }
        // System.out.println(str);
        // System.out.println(set);

        System.out.println(set.isEmpty());
    }
}
