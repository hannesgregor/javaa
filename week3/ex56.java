import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class ex56 {
    public static String reverse(String text) {
        // write your code here
        String result = "";

        int i = text.length() - 1;

        while (i>=0) {
            result+= text.charAt(i);
            i--;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
