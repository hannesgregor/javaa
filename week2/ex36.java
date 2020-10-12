import java.util.Scanner;

public class ex36 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int sum = 0;
        int numbers = 0;
        int even = 0;

        System.out.println("type some numbers: ");

        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }

            sum+= number;
            numbers++;
            if (number % 2 == 0) {
                even++;
            }
        }

        double average = (double) sum / numbers;

        int odd = numbers - even;

        System.out.println("cya");
        System.out.println("Sum is: " + sum);
        System.out.println("number of numbers: "+ numbers);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);



        System.out.println("Sum in the end: " + sum);
    }
}

