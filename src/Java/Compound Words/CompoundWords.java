import java.util.ArrayList;
import java.util.TreeSet;

public class CompoundWords {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        ArrayList<String> list = new ArrayList<>();
        TreeSet<String> set = new TreeSet<>();
        while (io.hasMoreTokens()) {
            list.add(io.getWord());
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i == j) {
                    continue;
                }
                set.add(list.get(i) + list.get(j));
            }
        }
        for (String str : set) {
            io.println(str);
        }
        io.flush();
    }
}