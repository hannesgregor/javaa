import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a year: ");
        int number = Integer.parseInt(reader.nextLine());

        if (number % 4 == 0 && number % 100 == 0 && number % 400 == 0){
            System.out.println("its a leap year!");
        } else {
            System.out.println("its not a leap year!");
        }


    }
}