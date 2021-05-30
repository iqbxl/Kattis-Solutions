import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class NoDuplicates {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        Set<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        while (io.hasMoreTokens()) {
            list.add(io.getWord());
        }
        for (String x : list) {
            set.add(x); //use the property that sets cannot have duplicates 
        }
        if (set.size() == list.size()) {
            io.print("yes");
        } else {
            io.print("no");
        }
        io.flush();
    }
}