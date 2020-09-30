import java.util.Scanner;

public class PosNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        if (number > 0) {
            System.out.println("Your number is positive!");
        } else {
            System.out.println("Your number is not positive!");
        }


    }
}
