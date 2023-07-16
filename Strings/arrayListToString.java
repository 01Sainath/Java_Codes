import java.util.*;
public class arrayListToString {
    public static void main(String[]args){
        ArrayList <Integer> list = new ArrayList<>();

        for(int i=0; i<10; i++){
            list.add(i);
        }

        StringBuilder str = new StringBuilder();

        for(int i=0; i<list.size(); i++){
            str.append(list.get(i));
        }

        System.out.println(str);
    }
}
