import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        System.out.println(reverseSentence("true is prophecy The"));
    }

    static String reverseSentence(String string){
        String[] split = string.split(" ");
        String reverse = " ";

        for (int i = split.length -1 ; i >=0 ; i--) {
            reverse += split[i] + " ";

        }
        return reverse;
    }
    }

