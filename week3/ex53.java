import java.util.Scanner;

public class ex53 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("type A WORD: ");

        String word = reader.nextLine();

        System.out.println("type the length u wish to see: ");

        int half = Integer.parseInt(reader.nextLine());


        System.out.println(word.substring(0,half));

    }

}
