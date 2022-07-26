package Arrays;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        colors[2] = "green";

        for (String color : colors) {
            System.out.print(color + " ");
        }

        Arrays.stream(colors).forEach(System.out::println); //



    }
}
