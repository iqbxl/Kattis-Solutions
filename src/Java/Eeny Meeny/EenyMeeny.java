import java.util.List;
import java.util.ArrayList;

public class EenyMeeny {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        List<String> names = new ArrayList<>(); // create dynamic arraylist. once element removed,  
        List<String> team1 = new ArrayList<>(); // index of remaining elements changes and closes the gap
        List<String> team2 = new ArrayList<>();
        int interval = io.getLine().split(" ").length - 1; // eg: interval of eeny meeny miny is 2
        int n = io.getInt(), index = 0;
        for (int i = 0; i < n; i++) {
            names.add(io.getWord());
        }
        for (int i = 0; i < n; i++) {
            index = (index + interval) % names.size(); // add the interval to the new index at each iteration
            if (i % 2 == 0) {                          // also, size of names list will decrement by 1
                team1.add(names.get(index));           // at each iteration due to remove(index) method
                names.remove(index);
            } else {
                team2.add(names.get(index));
                names.remove(index);
            }
        }
        io.println(team1.size());
        for (String name : team1) {
            io.println(name);
        }
        io.println(team2.size());
        for (String name : team2) {
            io.println(name);
        }
        io.flush();
    }
}