import java.util.Scanner;


public class GuessingGame {

    public static void main(String[] args) {
        // test your program here
        GuessingGame game = new GuessingGame();
        game.play(1,10);
    }

    private Scanner reader;

    public GuessingGame() {
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(upperLimit, lowerLimit);
        // write the game logic here
        while (lowerLimit < upperLimit) {
            int middle = average(upperLimit, lowerLimit);
            if (isGreaterThan(middle)) {
                lowerLimit = middle + 1;
            } else {
                upperLimit = middle;
            }
        }
        System.out.println("The number you are thinking is: " + lowerLimit);
    }



    // implement here the methods isGreaterThan and average

    public boolean isGreaterThan(int luku) {
        System.out.println("Is your number greater than " + luku + "? (y/n)");
        String answer = this.reader.nextLine();

        return answer.equals("y");
    }

    public int average (int first, int second) {
        return (first + second) / 2;
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking of with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value
        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}