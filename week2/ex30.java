import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("up to what number?");
        int read = Integer.parseInt(reader.nextLine());

        int sum = 1;

        while (sum <= read ) {

            System.out.println(sum);
            sum+=1;
        }
//        System.out.println("Sum in the end: " + sum);
    }
}

