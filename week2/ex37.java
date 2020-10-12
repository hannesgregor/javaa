public class ex37 {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times       
        int printed = 0;
        while (printed < amount) {
            System.out.print("*");
            printed +=1;
        }
        System.out.println("");
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int printed = 0;
        while (printed < sideSize) {
            printStars(sideSize);
            printed +=1;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int printed = 0;
        while (printed < height) {
            printStars(width);
            printed +=1;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int row = 1;
        while (row <= size) {
            printStars(row);
            row +=1;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}


