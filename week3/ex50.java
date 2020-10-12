import java.io.StringReader;
import java.util.Scanner;

public class ex50 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("type your name: ");

        String nimi = reader.nextLine();

        if (nimi.length() > 3) {
            System.out.println("1. char: "+ nimi.charAt(0) + " 2.char: " + nimi.charAt(1) + " 3.char: " + nimi.charAt(2));
        } else {
            return;
        }

}
}
