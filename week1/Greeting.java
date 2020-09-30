import java.util.Scanner;

public class Divider {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("type 2 integer numbers: ");
        int num1 = Integer.parseInt(reader.nextLine());
        int num2 = Integer.parseInt(reader.nextLine());
        double result = 1.0 * num1 / num2;

        System.out.println(result);
    }
}