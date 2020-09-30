import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Who is greeted: ");
        String name = reader.nextLine();

        System.out.println("Hi " + name);
    }
}