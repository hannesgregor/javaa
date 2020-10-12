// import java.util.Scanner;

public class ex44 {
    public static int least(int number1, int number2) {
        // write program code here
        // do not print anything inside the method
        // Scanner reader = new Scanner(System.in);

        if (number1 > number2) {
            return number2;
        } else {
            return number1;
        }
        // method needs a return in the end
    }

    public static void main(String[] args) {
        int answer =  least(8, 7);
        System.out.println("Least: " + answer);
    }}


