import java.util.*;

public class ex62 {
    public static void removeLast(ArrayList<String> list) {
        int indexLast = list.size() - 1;
        list.remove(indexLast);
    }

    public static void main(String[] args) {
        ArrayList<String> brothers = new ArrayList<String>();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");

        System.out.println("brothers:");
        System.out.println(brothers);

// sorting brothers
        Collections.sort(brothers);

// removing the last item
        removeLast(brothers);

        System.out.println(brothers);

    }
}
