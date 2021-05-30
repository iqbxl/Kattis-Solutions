import java.util.Arrays;
import java.util.Comparator;

public class SidewaysSorting {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        while (true) {
            int r = io.getInt(), c = io.getInt();
            if (r == 0 && c == 0) break;
            String[] arr = new String[c];
            Arrays.fill(arr, "");
            for (int i = 0; i < r; i++) {
                String line = io.getLine();
                for (int j = 0; j < c; j++) {
                    arr[j] += line.charAt(j); // the array now contains a string of all the columns
                }
            }
            Arrays.sort(arr, new Comparator<String>() {
                public int compare(String s1, String s2) { // compare(s1, s2) returns an int
                    s1 = s1.toUpperCase();
                    s2 = s2.toUpperCase();
                    return s1.compareTo(s2); // sort array lexicographically by the column
                }
            });
            for (int i = 0; i < r; i++) {
                String res = "";
                for (int j = 0; j < arr.length; j++) { // c == arr.length
                    res += arr[j].charAt(i);
                }
                io.println(res);
            }
            io.println();
        }
        io.flush();
    }
}