import java.util.ArrayList;
import java.util.Scanner;

public class ex58 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<String>();

        int place = 0;

        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();


            place++;

            if (words.contains(word)) {
                System.out.printf("You typed the word " + word + " twice.");
                break;

            }
            words.add(word);

        }
    }
}
