package randomProblems;
import java.util.*;

class Result{
    public static String getPhoneNumber(String s) {
        int Double=0;
        int triple=0;

        String num[] = s.split(" ");
        ArrayList <Integer> list = new ArrayList<>();
        for(int i=0; i<num.length; i++){
            String str = num[i];
            
            if(str.equals("double")){
                Double++;
                continue;
            }
            else if(str.equals("triple")){
                triple++;
                continue;
            }
            else{
                if(Double>0){
                    switch(str){
                        case "zero":list.add(0);list.add(0);break;
                        case "one":list.add(1);list.add(1);break;
                        case "two":list.add(2);list.add(2);break;
                        case "three":list.add(3);list.add(3);break;
                        case "four":list.add(4);list.add(4);break;
                        case "five":list.add(5);list.add(5);break;
                        case "six":list.add(6);list.add(6);break;
                        case "seven":list.add(7);list.add(7);break;
                        case "eight":list.add(8);list.add(8);break;
                        case "nine":list.add(9);list.add(9);break;
                    }
                    Double=0;
                }
                else if(triple>0){
                    switch(str){
                        case "zero":list.add(0);list.add(0);list.add(0);break;
                        case "one":list.add(1);list.add(1);list.add(1);break;
                        case "two":list.add(2);list.add(2);list.add(2);break;
                        case "three":list.add(3);list.add(3);list.add(3);break;
                        case "four":list.add(4);list.add(4);list.add(4);break;
                        case "five":list.add(5);list.add(5);list.add(5);break;
                        case "six":list.add(6);list.add(6);list.add(6);break;
                        case "seven":list.add(7);list.add(7);list.add(7);break;
                        case "eight":list.add(8);list.add(8);list.add(8);break;
                        case "nine":list.add(9);list.add(9);list.add(9);break;
                    }
                    triple=0;
                }
                else{
                    switch(str){
                        case "zero":list.add(0);break;
                        case "one":list.add(1);break;
                        case "two":list.add(2);break;
                        case "three":list.add(3);break;
                        case "four":list.add(4);break;
                        case "five":list.add(5);break;
                        case "six":list.add(6);break;
                        case "seven":list.add(7);break;
                        case "eight":list.add(8);break;
                        case "nine":list.add(9);break;
                }
               } 
            }
            
            
        }
        StringBuilder str = new StringBuilder(); 
        
        for(int i=0; i<list.size(); i++){
            str.append(list.get(i));  
        }

        String S = new String(str);
        return S;
    
        }
}
public class phoneNumber {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        String result = Result.getPhoneNumber(s);


        System.out.println(result);
        // for(String ele: num){
        //     System.out.print(ele+" ");
        // }
        
    }
}
