import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your points [0-60]: ");
        int number = Integer.parseInt(reader.nextLine());

        if (number <= 29) {
            System.out.println("You failed!");
        } else if  (number >= 30 && number <=34) {
            System.out.println("Your grade is 1!");
        } else if (number >= 35 && number <=39) {
            System.out.println("Your grade is 2!");
        }else if (number >= 40 && number <=44) {
            System.out.println("Your grade is 3!");
        }else if (number >= 45 && number <=49) {
            System.out.println("Your grade is 4!");
        }else if (number >= 50 && number <=60) {
            System.out.println("Your grade is 5!");
        }else {
            System.out.println("Type the correct amount of points!");
        }


    }
}