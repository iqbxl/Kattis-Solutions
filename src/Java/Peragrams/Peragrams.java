import java.util.List;
import java.util.ArrayList;

public class Peragrams {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String input = io.getLine();
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            if (arr.contains(input.substring(i, i + 1))) {
                arr.remove(arr.indexOf(input.substring(i, i + 1))); // indexOf() returns index of first occurence
            } else {
                arr.add(input.substring(i, i + 1));
            }
        }
        if (arr.size() == 0) { // all letters cancel each other out
            io.print("0");
        } else {
            io.print(arr.size() - 1);
        }
        io.flush();
    }
}