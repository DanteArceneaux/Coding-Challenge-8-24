package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class WorkingWith2DArrays {
    public static void main(String[] args) {


        System.out.println(removeDuplicates("Dante Arceneaux"));
    }


    public static String removeDuplicates(String str){
        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet<>();

       for(char ch : str.toCharArray()){
           if(!seen.contains(ch)){
               seen.add(ch);
               output.append(ch);
           }
       }
       String result = output.toString();

       return result; //
    }
}