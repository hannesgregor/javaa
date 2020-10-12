import java.util.Random;
import java.util.Scanner;


public class ex41 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        int guessesMade = 0;

        while (true) {
            System.out.printf("Guess a number: ");

            int guess = Integer.parseInt(reader.nextLine());

            guessesMade++;

            if (guess == numberDrawn) {
                break;
            } else if(guess<numberDrawn) {
                System.out.println("The number is greater, guesses made: " + guessesMade);
            } else {
                System.out.println("The number is lesser, guesses made: " + guessesMade);
            }
        }
        System.out.println("Congratulations, your guess is correct!");




    }
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}

