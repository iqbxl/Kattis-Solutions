import java.util.Arrays;
import java.util.Comparator; // to sort array according to user defined criteria

public class SortOfSorting {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        while (true) {
            int n = io.getInt();
            if (n == 0) break;
            String[] names = new String[n];
            for (int i = 0; i < n; i++) {
                names[i] = io.getWord();
            }
            Arrays.sort(names, Comparator.comparing(x -> x.substring(0, 2))); // compare array elements by sorting
            for (String name : names) {                                       // only using first two letters
                io.println(name);
            }
            io.println();
        }
        io.flush();
    }
}