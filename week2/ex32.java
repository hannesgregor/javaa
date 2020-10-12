import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("until what?");
        int limit = Integer.parseInt(reader.nextLine());
        int counter = 0;
        int sum = 0;

        while (counter < limit ) {

            counter+=1;

            sum+=counter;
        }
      System.out.println("Sum in the end: " + sum);
    }
}

